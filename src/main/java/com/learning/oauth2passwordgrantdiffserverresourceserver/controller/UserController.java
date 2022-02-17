package com.learning.oauth2passwordgrantdiffserverresourceserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(value = "/me")
public class UserController {
    
    @GetMapping
    //@PreAuthorize("hasRole('ROLE_USER')")
    public Principal getPrincipal(final Principal principal) {
        return principal;
    }

    @GetMapping("/person-name")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String getPersonName() {
        return "John";
    }
}
