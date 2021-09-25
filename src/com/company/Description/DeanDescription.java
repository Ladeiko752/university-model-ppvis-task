package com.company.Description;

import com.company.Model.TeacherModel;

import java.util.ArrayList;

public interface DeanDescription {
    String getFullName();
    String getPhoneNumber();
    void expelStudent(GroupDescription groups, String name) throws Exception;
    void addStudent(StudentDescription student,  GroupDescription groups) throws Exception;
    void addTeacher(String name, String phone, String discipline, TeachingDescription teaching) throws Exception;
    void fireTeacher(TeachingDescription teaching, String name) throws Exception;
}
