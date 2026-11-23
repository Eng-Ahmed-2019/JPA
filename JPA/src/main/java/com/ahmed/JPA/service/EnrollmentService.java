package com.ahmed.JPA.service;

import java.time.LocalDate;
import lombok.extern.slf4j.Slf4j;
import com.ahmed.JPA.entity.Course;
import com.ahmed.JPA.entity.Student;
import lombok.RequiredArgsConstructor;
import com.ahmed.JPA.entity.Enrollment;
import org.springframework.stereotype.Service;
import com.ahmed.JPA.repository.CourseRepository;
import com.ahmed.JPA.repository.StudentRepository;
import com.ahmed.JPA.repository.EnrollmentRepository;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class EnrollmentService {
    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;
    private final EnrollmentRepository enrollmentRepository;
    //private static final Logger log = LoggerFactory.getLogger(EnrollmentService.class);

    @Transactional(rollbackFor = Exception.class)
    public void enrollStudent(Long studentId, Long courseId) throws Exception{

        log.info(
                "Starting enrollment for student {} in course {}",
                studentId,
                courseId
        );
        Student student = studentRepository.findById(studentId)
                .orElseThrow(()->{
                    log.error("Student {} not found", studentId);
                    return new RuntimeException("Student not found");
                });

        Course course = courseRepository.findById(courseId)
                .orElseThrow(()->{
                    log.warn("Course {} not found", courseId);
                    return new RuntimeException("Course not found");
                });

        Enrollment enrollment = new Enrollment();
        enrollment.setStudent(student);
        enrollment.setCourse(course);
        enrollment.setEnrollmentDate(LocalDate.now());
        enrollment.setStatus("Active");
        enrollment.setGrade(100D);
        enrollmentRepository.saveAndFlush(enrollment);

        log.info(
                "Enrollment created successfully for student {} in course {}",
                studentId,
                courseId
        );

        try {
    // some operation
} catch (Exception ex) {
    log.error("Something went wrong {}", ex.getMessage());
}
    }
}