package com.student.and.course.demo.Student;

import jakarta.persistence.*;

@Entity
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;

    private String course;

    public Object getFirstName() {

        return firstName;
    }

    public Object getLastName() {
        return null;
    }

    public Object getEmail() {
        return null;
    }

    public Object getCourse() {
        return null;
    }

    public void getClass(Object firstName) {
    }

    // Getters and Setters
}


