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

    @NotBlank(message = "Name required")
    @Size(min = 3, message = "Name must be at least 3 characters long")
    private String name;

    @NotBlank (message = "email required")
    @Email (message = "Invalid email")
    private String email;

    @NotBlank (message = "Username required")
    @Size(min = 3, message = "Username must be at least 3 characters long")
    private String userName;

    @NotBlank (message = "Password required")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;

    @NotBlank(message = "Please verify password")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String verify;

    public Person() {}

    public Person(String name, String email, String userName, String password, String verify) {
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.verify = verify;
    }

    public @NotBlank(message = "Name required") @Size(min = 3, message = "Name must be at least 3 characters long") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name required") @Size(min = 3, message = "Name must be at least 3 characters long") String name) {
        this.name = name;
    }

    public @NotBlank(message = "email required") @Email(message = "Invalid email") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "email required") @Email(message = "Invalid email") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Username required") @Size(min = 3, message = "Username must be at least 3 characters long") String getUserName() {
        return userName;
    }

    public void setUserName(@NotBlank(message = "Username required") @Size(min = 3, message = "Username must be at least 3 characters long") String userName) {
        this.userName = userName;
    }

    public @NotBlank(message = "Password required") @Size(min = 8, message = "Password must be at least 8 characters long") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Password required") @Size(min = 8, message = "Password must be at least 8 characters long") String password) {
        this.password = password;
    }

    public @NotBlank(message = "Please verify password") @Size(min = 8, message = "Password must be at least 8 characters long") String getVerify() {
        return verify;
    }

    public void setVerify(@NotBlank(message = "Please verify password") @Size(min = 8, message = "Password must be at least 8 characters long") String verify) {
        this.verify = verify;
    }

    public int getId() {
        return id;
    }

}
