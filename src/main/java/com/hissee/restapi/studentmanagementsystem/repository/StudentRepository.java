package com.hissee.restapi.studentmanagementsystem.repository;

import com.hissee.restapi.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
