package com.ahmed.JPA;

/*
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import com.ahmed.JPA.entity.Course;
import com.ahmed.JPA.entity.Student;
import com.ahmed.JPA.entity.Enrollment;
import com.ahmed.JPA.repository.CourseRepository;
import com.ahmed.JPA.repository.StudentRepository;
import com.ahmed.JPA.repository.EnrollmentRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class EnrollmentTest {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    @Test
    void enrollmentDemo() {

        Student student = new Student();
        student.setFirstName("Ahmed");
        student.setLastName("Ali");
        student.setEmail("enrollment@example.com");
        student.setAge(22);
        studentRepository.save(student);

        Course course = new Course();
        course.setName("Spring Boot");
        courseRepository.save(course);

        Enrollment enrollment = new Enrollment();

        enrollment.setStudent(student);
        enrollment.setCourse(course);
        enrollment.setEnrollmentDate(LocalDate.now());
        enrollment.setGrade(95.0);
        enrollment.setStatus("ACTIVE");
        enrollmentRepository.save(enrollment);

        System.out.println("Enrollment ID: " + enrollment.getId());
        System.out.println("Grade: " + enrollment.getGrade());
        System.out.println("Status: " + enrollment.getStatus());
    }
}*/