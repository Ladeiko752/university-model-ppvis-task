package com.company.Model;

import com.company.Description.GroupDescription;
import com.company.Description.StudentDescription;

import java.util.ArrayList;

public class GroupModel implements GroupDescription {
    private int groupNumber;
    private String faculty;
    private String speciality;
    private ArrayList<StudentDescription> students;

    public GroupModel(int groupNumber, String faculty, String speciality) {
        this.groupNumber = groupNumber;
        this.faculty = faculty;
        this.speciality = speciality;
        this.students = new ArrayList<>();
    }

    @Override
    public int getGroupNumber() {
        return groupNumber;
    }

    @Override
    public String getFaculty() {
        return faculty;
    }

    @Override
    public String getSpeciality() {
        return speciality;
    }

    @Override
    public ArrayList<StudentDescription> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Group number: " + groupNumber +
                ", faculty: " + faculty +
                ", speciality: " + speciality + '\n' +
                "students=" + students;
    }
}
