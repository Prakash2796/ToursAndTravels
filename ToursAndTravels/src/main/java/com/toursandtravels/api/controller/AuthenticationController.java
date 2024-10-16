package com.toursandtravels.api.controller;

import com.toursandtravels.api.model.AuthenticationRequest;
import com.toursandtravels.api.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/authenticate")
    public String createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));

        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());

        return jwtTokenUtil.generateToken(userDetails.getUsername());
    }
}
