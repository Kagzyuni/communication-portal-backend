package com.communication.portal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @GetMapping(value = "login")
    public ResponseEntity<String> loginUser(){
        return new ResponseEntity<>("Logged In",HttpStatus.OK);
    }
}
