package com.communication.portal.controller;

import com.communication.portal.manager.AccountManager;
import com.communication.portal.model.LoginModel;
import com.communication.portal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class AccountsController {

    @Autowired
    private AccountManager accountManager;

    @PostMapping(value = "login")
    public ResponseEntity<User> loginUser(@RequestBody LoginModel loginModel){
        return new ResponseEntity<>(accountManager.authenticateUser(loginModel),HttpStatus.OK);
    }

    @PostMapping(value = "register")
    public ResponseEntity<String> registerUser(@RequestBody User user){
        return new ResponseEntity<>(accountManager.registerUser(user),HttpStatus.OK);
    }

    @GetMapping(value = "users")
    public ResponseEntity<List<User>> getUsers(){
        return new ResponseEntity<>(accountManager.getAllUsers(),HttpStatus.OK);
    }
}
