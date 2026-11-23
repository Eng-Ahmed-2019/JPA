package com.ahmed.JPA.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.ArrayList;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
import org.hibernate.annotations.Check;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.UniqueConstraint;

@Entity
@Getter
@Setter
@Table(
    name = "students",
    indexes = {
        @Index(
            name = "idx_student_first_name",
            columnList = "first_name,last_name"
        )
    },
    uniqueConstraints = {
        @UniqueConstraint(
            name = "uk_student_email",
            columnNames = "email"
        )
    }
)
@Check(constraints = "age >= 18")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer age;

    @Column(name = "first_name",nullable = false,length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false,length = 100)
    private String email;

    @OneToOne(
        mappedBy = "student",
        fetch = FetchType.LAZY,
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private StudentProfile profile;

    @ManyToOne(fetch = FetchType.LAZY) // this relation it will have a foreign key
    @JoinColumn(name = "department_id")
    private Department department;

    // @ManyToMany(fetch = FetchType.LAZY)
    // @JoinTable(
    //     name = "student_courses",
    //     joinColumns = @JoinColumn(name = "student_id"),
    //     inverseJoinColumns = @JoinColumn(name = "course_id")
    // )
    // private List<Course> courses = new ArrayList<>();
    @OneToMany(mappedBy = "student",fetch = FetchType.LAZY)
    private List<Enrollment> enrollments = new ArrayList<>();

    public void setProfile(StudentProfile profile){

        if (this.profile != null) {
            this.profile.setStudent(null);
        }

        this.profile = profile;

        if (profile != null) {
            profile.setStudent(this);
        }
    }
}