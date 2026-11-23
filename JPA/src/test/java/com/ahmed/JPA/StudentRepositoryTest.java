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
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void repositoryDemo() {

        Student student = new Student();
        student.setFirstName("Omar");
        student.setLastName("Mohamed");
        student.setEmail("omar.repository@example.com");
        student.setAge(21);

        Student savedStudent = studentRepository.save(student);
        System.out.println("My Id = " + savedStudent.getId());

        //var result = studentRepository.findById(savedStudent.getId()).orElseThrow();
        var result = studentRepository.findById(savedStudent.getId());
        if (result.isPresent()) {
            Student s = result.get();
            System.out.println("My name is: " + s.getFirstName());
        }else{
            System.out.println("No data");
        }
        var ss = studentRepository.findAll();
        ss.forEach(s->{
            System.out.println(s.getFirstName());
        });
    }
}
*/