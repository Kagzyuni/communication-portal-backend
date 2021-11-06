package com.communication.portal.model;

import com.communication.portal.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user")
@Table(name = "user")
public class User {

   @Id
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private UserType userType;
    private String phoneNumber;
    private boolean isActive;
}
