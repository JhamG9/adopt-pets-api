package com.example.petsCrud.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class JwtDto {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
