package com.hissee.restapi.studentmanagementsystem.controller;


import com.hissee.restapi.studentmanagementsystem.entity.Student;
import com.hissee.restapi.studentmanagementsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService service;

    @PostMapping
    public Student postStudent(@RequestBody Student student){

        if (student.getName().length() < 3){
            throw new IllegalArgumentException("Name should be atleast 3 letters");
        }
        return service.createStudent(student);
    }

    @GetMapping
    public List<Student> getStudents(){
        return service.readStudents();
    }

    @GetMapping("{id}")
    public Student getStudentById(@PathVariable int id){
        return service.readStudentById(id);
    }

    @PutMapping("{id}")
    public Student putStudent(@PathVariable int id, Student updatedStudent){
        return service.updateStudent(id, updatedStudent);
    }

    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
    }
}
