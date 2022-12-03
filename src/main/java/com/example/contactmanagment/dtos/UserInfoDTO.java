package com.example.contactmanagment.dtos;

import com.example.contactmanagment.models.Role;

import java.util.List;
import java.util.Objects;


public class UserInfoDTO {

    private long id;
    private String firstName;
    private String lastName;
    private String address;
    private String username;
    private Role role;
    private List<ContactDTO> listOfContacts;

    public UserInfoDTO() {
    }

    public UserInfoDTO(long id, String firstName, String lastName, String address, String username, Role role, List<ContactDTO> listOfContacts) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.username = username;
        this.role = role;
        this.listOfContacts = listOfContacts;
    }

    public UserInfoDTO(String firstName, String lastName, String address, String username, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.username = username;
        this.role = role;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<ContactDTO> getListOfContacts() {
        return listOfContacts;
    }

    public void setListOfContacts(List<ContactDTO> listOfContacts) {
        this.listOfContacts = listOfContacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfoDTO that = (UserInfoDTO) o;
        return id == that.id && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(address, that.address) && Objects.equals(username, that.username) && role == that.role && Objects.equals(listOfContacts, that.listOfContacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, address, username, role, listOfContacts);
    }
}
