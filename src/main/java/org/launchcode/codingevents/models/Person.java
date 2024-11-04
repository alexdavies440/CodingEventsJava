package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank
    @Size(min = 3)
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 3)
    private String userName;

    @NotBlank
    @Size(min = 8)
    private String password;

    @NotBlank
    @Size(min = 8)
    private String verify;

    public Person() {}

    public Person(String name, String email, String userName, String password, String verify) {
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.verify = verify;
    }
}
