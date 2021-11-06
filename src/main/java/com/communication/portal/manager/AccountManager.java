package com.communication.portal.manager;

import com.communication.portal.model.LoginModel;
import com.communication.portal.model.User;
import com.communication.portal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class AccountManager {

    @Autowired
    private UserRepository userRepository;

    public String registerUser(User user){

        try {
            System.out.println();
            userRepository.save(user);
        } catch (Exception e){
            throw new RuntimeException("Error Registering Account");
        }
        return "Success";
    }

    public User authenticateUser(LoginModel loginModel) {

        Optional<User> user;
        try {
           user=userRepository.findById(loginModel.getEmail());
        } catch (Exception ex){
            throw new RuntimeException("No user Found");
        }

        if(isValidPassword(user,loginModel)){
            return user.orElseGet(User::new);
        } else {
            throw new RuntimeException("Wrong Email or Password");
        }
    }

    public boolean isValidPassword(Optional<User> user, LoginModel loginModel){
        AtomicBoolean valid = new AtomicBoolean(false);
        user.ifPresent( user1 -> {
            valid.set(loginModel.getPassword().equalsIgnoreCase(user1.getPassword()));
        });
        return valid.get();
    }
}
