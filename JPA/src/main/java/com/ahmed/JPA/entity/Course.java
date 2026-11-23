package com.ahmed.JPA.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "course",fetch = FetchType.LAZY)
    private List<Enrollment> enrollments = new ArrayList<>();
}