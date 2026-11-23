package com.ahmed.JPA.repository;

import com.ahmed.JPA.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment,Long>{}