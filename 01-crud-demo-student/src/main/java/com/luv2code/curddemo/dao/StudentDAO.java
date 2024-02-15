package com.luv2code.curddemo.dao;

import com.luv2code.curddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findStudent(int id);

    List<Student> findAllStudent();

    List<Student> findByFirstName(String firstName);

    void updateStudentFirstName(int id, String newFirstName);

    int updateMultiStudentLastName(String FirstName, String newLastName);

    int deleteOneStudent(int id);
}
