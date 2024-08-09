package com.student.and.course.demo.Service;


import com.student.and.course.demo.Repository.StudentRepository;
import com.student.and.course.demo.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));

        student.getClass(studentDetails.getFirstName());
        student.getClass(studentDetails.getLastName());
        student.getClass(studentDetails.getEmail());
        student.getClass(studentDetails.getCourse());

        return studentRepository.save(student);
    }}