package com.company.Description;

import com.company.Model.GroupModel;
import com.company.Model.StudentModel;

public interface OperationsWithStudentsDescription {
    void addStudent(StudentDescription student,  GroupDescription groups) throws Exception;
    void expelStudent(GroupDescription groups, String name) throws Exception;
    String showGroup(GroupModel group);
}
