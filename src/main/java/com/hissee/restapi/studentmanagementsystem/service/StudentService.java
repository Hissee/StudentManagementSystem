package com.hissee.restapi.studentmanagementsystem.service;

import com.hissee.restapi.studentmanagementsystem.entity.Student;
import com.hissee.restapi.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repo;
    public Student createStudent(Student student){
        return repo.save(student);
    }

    public List<Student> readStudents(){
        return repo.findAll();
    }

    public Student readStudentById(int id){
        return repo.findById(id).orElse(null);
    }

    public Student updateStudent(int id, Student updatedStudent){
        Student student =  repo.findById(id).orElse(null);
        if (student != null){
            student.setName(updatedStudent.getName());
            student.setCourse(updatedStudent.getCourse());
            student.setEmail(updatedStudent.getEmail());
            repo.save(student);
        }
        return null;
    }

    public void deleteStudent(int id){
        repo.deleteById(id);
    }

}
