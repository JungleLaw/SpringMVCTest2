package cn.law.springmvc.demo.mapping;

import cn.law.springmvc.demo.pojo.Student;

public interface StudentMapper {
    Student findStudentById(int id);

    int insertStudent(Student s);
}
