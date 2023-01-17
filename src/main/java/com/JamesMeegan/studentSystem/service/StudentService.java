package com.JamesMeegan.studentSystem.service;

import com.JamesMeegan.studentSystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
