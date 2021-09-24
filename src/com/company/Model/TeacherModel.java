package com.company.Model;

import com.company.Description.StudentDescription;
import com.company.Description.TeacherDescription;

import java.util.ArrayList;

public class TeacherModel extends PersonalModel implements TeacherDescription {
    private String discipline;
    private ArrayList<StudentDescription> students;

    public TeacherModel(String fullName, String phoneNumber, String discipline) {
        super(fullName, phoneNumber);
        this.discipline = discipline;
    }

    public void showGroup(){
        //
    }

    @Override
    public ArrayList<StudentDescription> getStudents() {
        return students;
    }

    @Override
    public String getDiscipline() {
        return discipline;
    }
}
