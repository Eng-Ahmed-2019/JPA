package com.ahmed.JPA;

/*
import org.junit.jupiter.api.Test;
import com.ahmed.JPA.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.test.context.SpringBootTest;

@Transactional
@SpringBootTest
public class EntityLifecycleTest {

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    void entityLifecycleDemo() {

        // 1. Transient
        Student student = new Student();

        student.setFirstName("Ahmed");
        student.setLastName("Ali");
        student.setEmail("lifecycle.demo@example.com");
        student.setAge(22);

        System.out.println("Transient: " +
                entityManager.contains(student)); // false

        // 2. Persist -> Managed
        entityManager.persist(student);

        System.out.println("Managed: " +
                entityManager.contains(student)); // true

        // 3. Dirty Checking
        student.setAge(23);
        student.setEmail("ahmed.updated@example.com");

        entityManager.flush(); // Dirty Checking

        // 4. Detach
        entityManager.detach(student);

        System.out.println("Detached: " +
                entityManager.contains(student)); // false

        // Changes while Detached
        student.setAge(30);

        entityManager.flush(); // no changes

        // 5. Merge
        Student managedStudent = entityManager.merge(student);

        System.out.println("Original: " +
                entityManager.contains(student)); // true

        System.out.println("Merged: " +
                entityManager.contains(managedStudent));

        // Changes while Managed again
        managedStudent.setAge(31);

        entityManager.flush(); // done

        // 6. Remove
        entityManager.remove(managedStudent);

        entityManager.flush(); // done

        System.out.println("Removed: " +
                entityManager.contains(managedStudent)); // false
    }
}
*/