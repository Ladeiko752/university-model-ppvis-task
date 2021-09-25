package com.company.Model;

import com.company.Description.StudentDescription;

public class StudentModel implements StudentDescription {
    private String fullName;
    private String phoneNumber;
    private int groupNumber;
    private int courseNumber;
    private boolean trainingStatus;

    public StudentModel(String fullName, String phoneNumber, int groupNumber, int courseNumber, boolean trainingStatus) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.groupNumber = groupNumber;
        this.courseNumber = courseNumber;
        this.trainingStatus = trainingStatus;
    }

    @Override
    public String getFullName() { return fullName; }

    @Override
    public String getPhoneNumber() { return phoneNumber; }

    @Override
    public int getGroupNumber() {
        return groupNumber;
    }

    @Override
    public int getCourseNumber() {
        return courseNumber;
    }

    @Override
    public boolean getTrainingStatus() {
        return true;
    }

    @Override
    public String toString() {
        return "fullName = " + fullName  +
                ", phoneNumber = " + phoneNumber  +
                ", groupNumber = " + groupNumber +
                ", courseNumber = " + courseNumber +
                ", trainingStatus = " + trainingStatus;
    }
}
