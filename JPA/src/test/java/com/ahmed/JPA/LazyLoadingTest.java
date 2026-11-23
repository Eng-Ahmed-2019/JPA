package com.ahmed.JPA;

/*
import org.junit.jupiter.api.Test;
import com.ahmed.JPA.entity.Student;
import com.ahmed.JPA.repository.StudentRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class LazyLoadingTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void lazyLoadingDemo() {

        Student s = new Student();
        s.setAge(10);
        s.setEmail("a.a@gmail.com");
        s.setFirstName("ahmed");
        s.setLastName("gamal");
        studentRepository.saveAndFlush(s);

        Student student = studentRepository.findAll()
                .stream()
                .findFirst()
                .orElseThrow();

        System.out.println("Student loaded");

        System.out.println(student.getFirstName());

        System.out.println("Accessing enrollments");

        System.out.println(student.getEnrollments().size());
    }
}*/