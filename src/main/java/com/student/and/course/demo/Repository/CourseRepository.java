package com.student.and.course.demo.Repository;




import com.student.and.course.demo.Student.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}