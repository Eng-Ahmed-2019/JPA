package com.ahmed.JPA;

/*
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import com.ahmed.JPA.entity.Course;
import com.ahmed.JPA.entity.Student;
import com.ahmed.JPA.repository.CourseRepository;
import com.ahmed.JPA.repository.StudentRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class ManyToManyTest {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Test
    void manyToManyDemo() {

        Course java = new Course();
        java.setName("Java");

        Course sql = new Course();
        sql.setName("SQL");

        courseRepository.save(java);
        courseRepository.save(sql);

        Student student = new Student();
        student.setFirstName("Ahmed");
        student.setLastName("Ali");
        student.setEmail("manytomany@example.com");
        student.setAge(22);

        student.setCourses(new ArrayList<>());
        student.getCourses().add(java);
        student.getCourses().add(sql);

        studentRepository.save(student);
    }
}*/