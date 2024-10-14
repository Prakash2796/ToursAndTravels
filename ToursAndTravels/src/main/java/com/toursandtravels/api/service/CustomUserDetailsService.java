package com.toursandtravels.api.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Here, you would load user data from the database or another source
        // For simplicity, we are creating a user with a hardcoded password
        return org.springframework.security.core.userdetails.User
                .withUsername(username)
                .password("{noop}password")  // {noop} is used to disable password encoding for testing purposes
                .roles("USER")
                .build();
    }
}
