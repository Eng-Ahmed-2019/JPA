package com.ahmed.JPA;

/*
import org.junit.jupiter.api.Test;
import com.ahmed.JPA.entity.Student;
import com.ahmed.JPA.entity.Department;
import com.ahmed.JPA.repository.StudentRepository;
import com.ahmed.JPA.repository.DepartmentRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class OneToManyTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Test
    void oneToManyDemo() {

        Department department = new Department();
        department.setName("Computer Science");
        departmentRepository.saveAndFlush(department);

        Student student1 = new Student();
        student1.setFirstName("Ahmed");
        student1.setLastName("Ali");
        student1.setEmail("dept1@example.com");
        student1.setAge(22);
        student1.setDepartment(department);

        Student student2 = new Student();
        student2.setFirstName("Omar");
        student2.setLastName("Hassan");
        student2.setEmail("dept2@example.com");
        student2.setAge(23);
        student2.setDepartment(department);

        studentRepository.saveAndFlush(student1);
        studentRepository.saveAndFlush(student2);

        department.getStudents().add(student1);
        department.getStudents().add(student2);

        Department savedDepartment =
                departmentRepository.findById(department.getId())
                        .orElseThrow();
        
        System.out.println(
                "Data: " + savedDepartment.getStudents().size()
        );
    }
}*/