package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {
    private String token;
    private long expiresIn;

    // Optional: You can keep the setter methods if you still want to use them
    // public LoginResponse setToken(String token) {
    //     this.token = token;
    //     return this;
    // }

    // public LoginResponse setExpiresIn(long expiresIn) {
    //     this.expiresIn = expiresIn;
    //     return this;
    // }
}
