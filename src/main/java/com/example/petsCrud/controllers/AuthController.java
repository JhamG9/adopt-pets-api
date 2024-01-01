package com.example.petsCrud.controllers;

import com.example.petsCrud.jwt.JWTAuthenticationConfig;
import com.example.petsCrud.dto.JwtDto;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JWTAuthenticationConfig jwtAuthtenticationConfig;

    @PostMapping
    private JwtDto createTokenUser(){
        JwtDto jwtDtoToken = new JwtDto();
        jwtDtoToken.setToken(this.jwtAuthtenticationConfig.getJWTToken("JhamG9"));

        return jwtDtoToken;
    }
}
