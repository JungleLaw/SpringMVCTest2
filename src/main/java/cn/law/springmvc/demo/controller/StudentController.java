package cn.law.springmvc.demo.controller;

import cn.law.springmvc.demo.pojo.Student;
import cn.law.springmvc.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/find")
    private String find(int id) {
        Student student = studentService.findStudentById(1);
        System.out.println(student.toString());
        return "success";
    }

    @RequestMapping("/insert")
    private String insert() {
        Student s = new Student();
        s.setNum("20181006");
        s.setUsername("s-name1");
        s.setPassword("s-pwd1");
        studentService.insertStudent(s);
        return "success";
    }
}
