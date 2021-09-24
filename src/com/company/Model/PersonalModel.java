package com.company.Model;

import com.company.Description.PersonalDescription;

public class PersonalModel implements PersonalDescription {
    private String fullName;
    private String phoneNumber;

    public PersonalModel(String fullName, String phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getFullName() {
        return fullName;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
