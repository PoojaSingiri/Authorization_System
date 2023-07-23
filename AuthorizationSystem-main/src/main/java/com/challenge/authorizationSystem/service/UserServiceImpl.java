package com.challenge.authorizationSystem.service;

import com.challenge.authorizationSystem.dtos.RegisterDto;
import com.challenge.authorizationSystem.exceptions.ItemExistsAlreadyException;
import com.challenge.authorizationSystem.models.Role;
import com.challenge.authorizationSystem.models.User;
import com.challenge.authorizationSystem.repository.RoleRepository;
import com.challenge.authorizationSystem.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder bcryptEncoder;
    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder bcryptEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.bcryptEncoder = bcryptEncoder;
    }

    @Override
    public String createUser(RegisterDto registerDto) {
        if(userRepository.existsByUsername(registerDto.getUsername())){
            throw new ItemExistsAlreadyException("User is already registered with username " + registerDto.getUsername());
        }
        User newUser = new User();
        BeanUtils.copyProperties(registerDto, newUser);
        newUser.setPassword(bcryptEncoder.encode(newUser.getPassword()));
        if(newUser.getName().contains("_admin")){
            Role roles = roleRepository.findByName("ROLE_ADMIN").get();
            newUser.setRoles(Collections.singletonList(roles));
        }
        else{
            Role roles = roleRepository.findByName("ROLE_USER").get();
            newUser.setRoles(Collections.singletonList(roles));
        }
        userRepository.save(newUser);
        return "Successfully Created User";
    }

    @Override
    public User getLoggedInUser() {
        return null;
    }
}
