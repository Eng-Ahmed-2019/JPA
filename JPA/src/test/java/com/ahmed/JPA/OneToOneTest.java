package com.ahmed.JPA;

/*
import org.junit.jupiter.api.Test;
import com.ahmed.JPA.entity.Student;
import com.ahmed.JPA.entity.StudentProfile;
import com.ahmed.JPA.repository.StudentRepository;
import com.ahmed.JPA.repository.StudentProfileRepository;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class OneToOneTest {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentProfileRepository profileRepository;

    @Test
    void createStudentWithProfile() {

        Student student = new Student();
        student.setFirstName("Ahmed");
        student.setLastName("Ali");
        student.setEmail("onetoone@example.com");
        student.setAge(22);
        student = studentRepository.saveAndFlush(student);

        StudentProfile profile = new StudentProfile();
        profile.setPhone("01012345678");
        profile.setAddress("Cairo");
        profile.setDateOfBirth(
            java.time.LocalDate.of(2001,6, 4)
        );
        profile.setStudent(student);
        profile = profileRepository.saveAndFlush(profile);

        StudentProfile savedProfile =
                profileRepository.findById(profile.getId())
                        .orElseThrow();

        System.out.println("Data = " + savedProfile.getStudent().getFirstName());
    }
}*/