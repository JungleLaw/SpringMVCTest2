package cn.law.springmvc.demo.service;

import cn.law.springmvc.demo.pojo.Student;

public interface StudentService {
    Student findStudentById(int id);

    int insertStudent(Student s);
}
