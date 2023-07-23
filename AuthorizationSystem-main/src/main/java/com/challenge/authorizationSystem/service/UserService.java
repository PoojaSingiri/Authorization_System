package com.challenge.authorizationSystem.service;

import com.challenge.authorizationSystem.dtos.RegisterDto;
import com.challenge.authorizationSystem.models.User;

public interface UserService {
    public String createUser(RegisterDto user);
    public User getLoggedInUser();
}
