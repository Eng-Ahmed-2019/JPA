package com.ahmed.JPA;

/*
import org.junit.jupiter.api.Test;
import com.ahmed.JPA.entity.Student;
import jakarta.transaction.Transactional;
import com.ahmed.JPA.entity.StudentProfile;
import com.ahmed.JPA.repository.StudentRepository;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CascadePersistTest {

    private StudentRepository repository;

@Test
@Transactional
public void testCascadePersist() {

    Student student = new Student();

    student.setFirstName("Ahmed");
    student.setLastName("Ali");
    student.setEmail("ahmed@test.com");
    student.setAge(22);

    StudentProfile profile = new StudentProfile();

    profile.setPhone("01012345678");
    profile.setAddress("Cairo");

    student.setProfile(profile);

    repository.saveAndFlush(student);
}

@Test
@Transactional
void testOrphanRemoval() { // orphan removal

    Student student = repository.findById(1L)
            .orElseThrow();

    student.setProfile(null);
}
}*/