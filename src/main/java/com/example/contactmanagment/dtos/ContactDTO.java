package com.example.contactmanagment.dtos;

import com.example.contactmanagment.models.ContactType;

public class ContactDTO {

    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private ContactType contactType;
    private UserInfoDTO user;

    public ContactDTO() {
    }

    public ContactDTO(long id, String firstName, String lastName, String phoneNumber, ContactType contactType, UserInfoDTO user) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.contactType = contactType;
        this.user = user;
    }

    public ContactDTO(String firstName, String lastName, String phoneNumber, ContactType contactType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.contactType = contactType;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public UserInfoDTO getUser() {
        return user;
    }

    public void setUser(UserInfoDTO user) {
        this.user = user;
    }
}
