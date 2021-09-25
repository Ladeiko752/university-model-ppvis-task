package com.company.Model;

import com.company.Description.*;
import com.company.Exam.DuplicateCheck;

public class DeanModel implements DeanDescription {
    private String fullName;
    private String phoneNumber;
    private OperationsWithStudentsDescription operations = new OperationsWithStudentsModel();
    private DuplicateCheck duplicate = new DuplicateCheck();

    public DeanModel(String fullName, String phoneNumber) {
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

    @Override
    public void expelStudent(GroupDescription groups, String name) throws Exception {
        operations.expelStudent(groups, name);
    }

    @Override
    public void addStudent(StudentDescription student, GroupDescription groups) throws Exception {
        if (!duplicate.checkDuplicate(groups.getStudents(), student.getFullName())) {
            operations.addStudent(student, groups);
        }
    }

    public void addTeacher(String name, String phone, String discipline, TeachingDescription teaching) throws Exception {
        if (teaching != null) {
            teaching.getTeachers().add(new TeacherModel(name, phone, discipline));
        }else throw new Exception("Преподовательская не создана");
    }

    @Override
    public void fireTeacher(TeachingDescription teaching, String name) throws Exception {
        if (teaching != null) {
            teaching.getTeachers().removeIf(teacher -> teacher.getFullName().equals(name));
        }else throw new Exception("Преподовательская не создана");
    }
}
