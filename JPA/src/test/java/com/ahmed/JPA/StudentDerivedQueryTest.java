package com.ahmed.JPA;

/*
import org.junit.jupiter.api.Test;
import com.ahmed.JPA.entity.Student;
import jakarta.transaction.Transactional;
import com.ahmed.JPA.repository.StudentRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@Transactional
@SpringBootTest
public class StudentDerivedQueryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void fetchJoinDemo() {

    Student student = studentRepository
            .findStudentWithEnrollmentsAndCourses(1L)
            .orElseThrow();

    System.out.println(student.getFirstName());

    student.getEnrollments().forEach(enrollment -> {

        System.out.println(enrollment.getCourse().getName());

    });
    }

    @Test
    void derivedQueriesDemo() {

        Student s1 = new Student();
        s1.setFirstName("Ahmed");
        s1.setLastName("Ali");
        s1.setEmail("ahmed.queries1@example.com");
        s1.setAge(20);

        Student s2 = new Student();
        s2.setFirstName("Ahmed");
        s2.setLastName("Mohamed");
        s2.setEmail("ahmed.queries2@example.com");
        s2.setAge(22);

        Student s3 = new Student();
        s3.setFirstName("Omar");
        s3.setLastName("Ali");
        s3.setEmail("omar.queries@example.com");
        s3.setAge(25);

        Student s4 = new Student();
        s4.setFirstName("Mariam");
        s4.setLastName("Hassan");
        s4.setEmail("mariam.queries@example.com");
        s4.setAge(18);

        studentRepository.save(s1);
        studentRepository.save(s2);
        studentRepository.save(s3);
        studentRepository.save(s4);

        // var result = studentRepository.findByFirstName("Ahmed");
        // result.forEach(s->{
        //     System.out.println(s.getFirstName()+", "+s.getLastName());
        // });

        // var result = studentRepository.findByFirstNameAndLastName("Ahmed", "Ali");
        // result.forEach(student ->
        //         System.out.println(student.getEmail())
        // );

        // var result = studentRepository.findByFirstNameOrLastName("Ahmed", "Ali");
        // result.forEach(student ->
        //         System.out.println("Data: " + student.getFirstName() + " " + student.getLastName())
        // );

        //var result = studentRepository.findByAgeGreaterThan(20);

        //var result = studentRepository.findByAgeGreaterThanEqual(20);

        //var result = studentRepository.findByAgeLessThan(20);

        //var result = studentRepository.findByAgeLessThanEqual(20);

        //var result = studentRepository.findByAgeBetween(18, 22);

        //var result = studentRepository.findByFirstNameContaining("ah");

        //var result = studentRepository.findByFirstNameStartingWith("Ah");

        //var result = studentRepository.findByFirstNameEndingWith("ed");

        //var result = studentRepository.findByAgeOrderByFirstNameAsc(20);

        //var result = studentRepository.findByAgeOrderByFirstNameDesc(20);

        //var result = studentRepository.findDistinctByFirstName("Ahmed");

        //var result = studentRepository.findByLastNameIsNull();

        //var result = studentRepository.findByLastNameIsNotNull();

        // boolean exists = studentRepository.existsByEmail("ahmed.queries1@example.com");
        // System.out.println(exists);

        // long count = studentRepository.countByAgeGreaterThan(20);
        // System.out.println(count);

        // long deletedCount = studentRepository.deleteByAgeLessThan(18);
        // System.out.println("Deleted: " + deletedCount);

        //Student student = studentRepository
        //.findStudentWithDepartment(1L)
        //.orElseThrow();
        //System.out.println(student.getFirstName());
        //System.out.println(student.getDepartment().getName());
    }
}*/