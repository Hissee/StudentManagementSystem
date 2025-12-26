package com.hissee.restapi.studentmanagementsystem.controller;


import com.hissee.restapi.studentmanagementsystem.entity.Student;
import com.hissee.restapi.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repository;
    //get all the students
    //localhost:8080/students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students = repository.findAll();
        return students;
    }

    @GetMapping("/student/{id}/")
    public Student getStudent(@PathVariable int id){
        Student student = repository.findById(id).get();
        return student;
    }

    @PostMapping("/student/add")
    public void addStudent(@RequestBody Student student){
        repository.save(student);
    }

    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable int id){
        Student student = repository.findById(id).get();
        repository.delete(student);
    }

}
