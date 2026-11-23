package com.ahmed.JPA;

import java.util.List;
import org.junit.jupiter.api.Test;
import com.ahmed.JPA.entity.Student;
import jakarta.transaction.Transactional;
import com.ahmed.JPA.repository.StudentRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest 
@Transactional
class NPlusOneTest {

    @Autowired 
    private StudentRepository studentRepository;

    @Test
    void testNPlusOne() {

        List<Student> students = studentRepository.findAll();

        for (Student student : students) {
            System.out.println(student.getFirstName());
 
            // N + 1 Problem...
            System.out.println(
                    student.getEnrollments().size()
            );
        }
    }
}