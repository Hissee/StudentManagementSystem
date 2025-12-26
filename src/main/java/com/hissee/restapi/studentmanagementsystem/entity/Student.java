package com.hissee.restapi.studentmanagementsystem.model;


import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int roll_no;

    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String course;

    public Student(){

    }

    public Student (String name, String email, String course){
        super();
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public int getRoll_no(){
        return roll_no;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
    public String getCourse(){
        return course;
    }

    public void setRoll_no(int roll_no){
        this.roll_no = roll_no;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setCourse(String course){
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
