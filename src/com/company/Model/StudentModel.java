package com.company.Model;

import com.company.Description.StudentDescription;

public class StudentModel extends PersonalModel implements StudentDescription {
    private int groupNumber;
    private int courseNumber;
    private boolean trainingStatus;

    public StudentModel(String fullName, String phoneNumber, int groupNumber, int courseNumber) {
        super(fullName, phoneNumber);
        this.groupNumber = groupNumber;
        this.courseNumber = courseNumber;
    }

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
}
