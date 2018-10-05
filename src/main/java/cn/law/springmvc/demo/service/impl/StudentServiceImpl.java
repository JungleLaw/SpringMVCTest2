package cn.law.springmvc.demo.service.impl;

import cn.law.springmvc.demo.mapping.StudentMapper;
import cn.law.springmvc.demo.pojo.Student;
import cn.law.springmvc.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper mapper;


    @Override
    public Student findStudentById(int id) {
        return mapper.findStudentById(id);
    }

    @Override
    public int insertStudent(Student s) {
        return mapper.insertStudent(s);
    }
}
