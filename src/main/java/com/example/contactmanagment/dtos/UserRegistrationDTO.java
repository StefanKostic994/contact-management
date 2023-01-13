package com.example.contactmanagment.dtos;

import com.example.contactmanagment.models.Role;
import com.example.contactmanagment.validators.Username;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

public class UserRegistrationDTO {

    private long id;

    @NotBlank(message = "First name cannot be blank!")
    @Size(min = 3, message = "First name must have minimum 3 characters!")
    private String firstName;

    @NotBlank(message = "First name cannot be blank!")
    @Size(min = 3, message = "Last name must have minimum 3 characters!")
    private String lastName;

    @NotBlank
    private String address;
    @Username
    private String username;

    @Size(min = 8, message = "The password must have a minimum of 8 characters")
    private String password;

    public UserRegistrationDTO() {
    }

    public UserRegistrationDTO(long id, String firstName, String lastName, String address, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRegistrationDTO that = (UserRegistrationDTO) o;
        return id == that.id && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(address, that.address) && Objects.equals(username, that.username) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, address, username, password);
    }
}
