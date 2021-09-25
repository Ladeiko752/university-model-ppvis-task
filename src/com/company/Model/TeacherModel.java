package com.company.Model;

import com.company.Description.OperationsWithStudentsDescription;
import com.company.Description.TeacherDescription;

public class TeacherModel implements TeacherDescription {
    private String fullName;
    private String phoneNumber;
    private String discipline;
    private OperationsWithStudentsDescription operations = new OperationsWithStudentsModel();

    public TeacherModel(String fullName, String phoneNumber, String discipline) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.discipline = discipline;
    }

    @Override
    public String getFullName() { return fullName; }

    @Override
    public String getPhoneNumber() { return phoneNumber; }

    @Override
    public String getDiscipline() {
        return discipline;
    }

    @Override
    public String showStudents(GroupModel group) {
        return group.toString();
    }
}
