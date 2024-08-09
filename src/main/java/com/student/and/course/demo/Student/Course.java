package com.student.and.course.demo.Student;


import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;
    private String description;
    private Integer duration;

    public Object getCourseName() {

        return null;
    }

    public Object getDescription() {
        
        return null;
    }

    public void getDuration() {
    return ;
   }

    public void setCourseName(Object courseName) {
    }

    // Getters and Setters
}