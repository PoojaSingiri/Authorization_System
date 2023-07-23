package com.challenge.authorizationSystem.init;

import com.challenge.authorizationSystem.models.Role;
import com.challenge.authorizationSystem.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {

        Role val1 = new Role(1, "ROLE_USER");
        Role val2 = new Role(2, "ROLE_ADMIN");
        roleRepository.save(val1);
        roleRepository.save(val2);
    }
}
