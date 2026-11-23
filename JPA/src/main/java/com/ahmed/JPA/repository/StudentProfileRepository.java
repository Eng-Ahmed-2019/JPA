package com.ahmed.JPA.repository;

import com.ahmed.JPA.entity.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfileRepository extends JpaRepository<StudentProfile,Long>{}