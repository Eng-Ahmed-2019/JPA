package com.ahmed.JPA;

import org.junit.jupiter.api.Test;
import com.ahmed.JPA.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Pageable;
import com.ahmed.JPA.repository.StudentRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
@Transactional
public class PaginationTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void myTest(){

        Pageable pageable = PageRequest.of(
            0, 
            3,
            Sort.by("firstName")
            .ascending().and(Sort.by("age").descending()));
        Page<Student> page = studentRepository.findAll(pageable);

        page.getContent().forEach(s->{
            System.out.println(s.getFirstName());
        });

        System.out.println("Total Elements: " + page.getTotalElements());
        System.out.println("Total Pages: " + page.getTotalPages());
        System.out.println("Current Page: " + page.getNumber());
        System.out.println("Has Next: " + page.hasNext());
    }
}