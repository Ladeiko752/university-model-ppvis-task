package com.company.Description;

import com.company.Model.GroupModel;

public interface TeacherDescription {
    String getFullName();
    String getPhoneNumber();
    String getDiscipline();
    String showStudents(GroupModel group);
}
