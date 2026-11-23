package com.ahmed.JPA.repository;

import com.ahmed.JPA.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long>{}