package com.student.and.course.demo.Repository;





import com.student.and.course.demo.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
