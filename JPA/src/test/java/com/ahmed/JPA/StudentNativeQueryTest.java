package com.ahmed.JPA;

import java.util.List;
import org.junit.jupiter.api.Test;
import com.ahmed.JPA.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import com.ahmed.JPA.repository.StudentRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class StudentNativeQueryTest {

    @Autowired
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp() {

        Student student1 = new Student();
        student1.setFirstName("Ahmed");
        student1.setLastName("Ali");
        student1.setEmail("ahmed.native1@example.com");
        student1.setAge(20);

        Student student2 = new Student();
        student2.setFirstName("Ahmed");
        student2.setLastName("Mohamed");
        student2.setEmail("ahmed.native2@example.com");
        student2.setAge(22);

        Student student3 = new Student();
        student3.setFirstName("Omar");
        student3.setLastName("Hassan");
        student3.setEmail("omar.native@example.com");
        student3.setAge(25);

        Student student4 = new Student();
        student4.setFirstName("Mariam");
        student4.setLastName("Ali");
        student4.setEmail("mariam.native@example.com");
        student4.setAge(18);

        studentRepository.saveAll(
                List.of(student1, student2, student3, student4)
        );
    }


    @Test
    void findByEmailNativeTest() {

        Student student =
                studentRepository.findByEmailNative(
                        "ahmed.native1@example.com"
                );

        System.out.println("Student: " + student.getFirstName());
        System.out.println("Email: " + student.getEmail());
    }


    @Test
    void findStudentsOlderThanNativeTest() {

        List<Student> students =
                studentRepository.findStudentsOlderThanNative(20);

        students.forEach(student ->
                System.out.println(
                        student.getFirstName() + " - " + student.getAge()
                )
        );
    }


    @Test
    void findStudentsByAgeRangeNativeTest() {

        List<Student> students =
                studentRepository.findStudentsByAgeRangeNative(18, 22);

        students.forEach(student ->
                System.out.println(
                        student.getFirstName() + " - " + student.getAge()
                )
        );
    }


    @Test
    void searchStudentsByNameNativeTest() {

        List<Student> students =
                studentRepository.searchStudentsByNameNative("ah");

        students.forEach(student ->
                System.out.println(student.getFirstName())
        );
    }


    @Test
    void countStudentsNativeTest() {

        long count =
                studentRepository.countStudentsNative(20);

        System.out.println("Count: " + count);
    }


    @Test
    void findAllStudentsOrderedByAgeNativeTest() {

        List<Student> students =
                studentRepository.findAllStudentsOrderedByAgeNative();

        students.forEach(student ->
                System.out.println(
                        student.getFirstName() + " - " + student.getAge()
                )
        );
    }


    @Test
    void updateStudentAgeNativeTest() {

        int updatedCount =
                studentRepository.updateStudentAgeNative(20, 23);

        System.out.println("Updated Rows: " + updatedCount);
    }


    @Test
    void deleteStudentsYoungerThanNativeTest() {

        int deletedCount =
                studentRepository.deleteStudentsYoungerThanNative(20);

        System.out.println("Deleted Rows: " + deletedCount);
    }
}