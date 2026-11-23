package com.ahmed.JPA.repository;

import java.util.List;
import java.util.Optional;
import com.ahmed.JPA.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long>{

    List<Student> findByFirstName(String firstName);

    List<Student> findByFirstNameAndLastName(String firstName, String lastName);

    List<Student> findByFirstNameOrLastName(String firstName, String lastName);

    List<Student> findByAgeGreaterThan(Integer age);

    List<Student> findByAgeGreaterThanEqual(Integer age);

    List<Student> findByAgeLessThan(Integer age);

    List<Student> findByAgeLessThanEqual(Integer age);

    List<Student> findByAgeBetween(Integer min, Integer max);

    List<Student> findByFirstNameContaining(String keyword);

    List<Student> findByFirstNameStartingWith(String prefix);

    List<Student> findByFirstNameEndingWith(String suffix);

    List<Student> findByAgeOrderByFirstNameAsc(Integer age);

    List<Student> findByAgeOrderByFirstNameDesc(Integer age);

    List<Student> findDistinctByFirstName(String firstName);

    List<Student> findByLastNameIsNull();

    List<Student> findByLastNameIsNotNull();

    boolean existsByEmail(String email);

    long countByAgeGreaterThan(Integer age);

    long deleteByAgeLessThan(Integer age);


    @Query("SELECT s FROM Student s WHERE s.age > 20")
    List<Student>findStudentsOlderThan20();


    @Query("SELECT s FROM Student s WHERE s.age > ?1") //Dynamic parameters in query
    //?1 it refer to first parameter in this method...
    List<Student>findStudentsOlderThan(Integer age);


    @Query("""
       SELECT s FROM Student s
       WHERE s.age BETWEEN ?1 AND ?2
       """) // More than one dynamic parameter...
    List<Student> findStudentsBetweenAges(Integer minAge, Integer maxAge);


    @Query("""
        SELECT s FROM Student s
        WHERE s.age > :age
        """)// Named Parameters, This is best practice
    List<Student>findStudentsOlderThanNamed(@Param("age")Integer age);

    
    @Query("""
           SELECT s FROM Student s
           WHERE s.age BETWEEN :minAge AND :maxAge
           """)
    List<Student> findStudentsBetweenAge(
        @Param("minAge") Integer minAge,
        @Param("maxAge") Integer maxAge);


    @Query("""
           SELECT s FROM Student s
           WHERE s.firstName = :firstName
           AND s.lastName = :lastName
           """)
    List<Student> findStudentsByFullName(
            @Param("firstName") String firstName,
            @Param("lastName") String lastName
        );

    
    @Query("""
           SELECT s FROM Student s
           WHERE s.firstName ILIKE CONCAT('%', :keyword, '%')
           """)
    List<Student> searchStudentsByName(
            @Param("keyword") String keyword);

    
    @Query("SELECT COUNT(s) FROM Student s WHERE s.age > :age")
    long countStudentsOlderThan(@Param("age") Integer age);


    @Modifying // update or delete
    @Query("""
        UPDATE Student s
        SET s.age = :newAge
        WHERE s.age = :oldAge
        """)
    int updateStudentAge(
            @Param("oldAge") Integer oldAge,
            @Param("newAge") Integer newAge);


    @Modifying(
        flushAutomatically = true,
        clearAutomatically = true // detached entity after this process, take care
    )
    @Query("DELETE FROM Student s WHERE s.age < :age")
    int deleteStudentsYoungerThan(@Param("age") Integer age);


    @Query(
        value = "select * from students where email = :email",
        nativeQuery = true
    )
    Student findByEmailNative(@Param("email")String email);


    @Query(
        value = "SELECT * FROM students WHERE age > :age",
        nativeQuery = true
    )
    List<Student> findStudentsOlderThanNative(@Param("age") Integer age);


    @Query(
        value = """
                SELECT *
                FROM students
                WHERE age BETWEEN :minAge AND :maxAge
                """,
        nativeQuery = true
    )
    List<Student> findStudentsByAgeRangeNative(
            @Param("minAge") Integer minAge,
            @Param("maxAge") Integer maxAge
    );

    @Query(
        value = """
                SELECT *
                FROM students
                WHERE first_name ILIKE CONCAT('%', :keyword, '%')
                """,
        nativeQuery = true
    )
    List<Student> searchStudentsByNameNative(
            @Param("keyword") String keyword
    );


    @Query(
        value = "SELECT COUNT(*) FROM students WHERE age > :age",
        nativeQuery = true
    )
    long countStudentsNative(@Param("age") Integer age);


    @Query(
        value = "SELECT * FROM students ORDER BY age DESC",
        nativeQuery = true
    )
    List<Student> findAllStudentsOrderedByAgeNative();


    @Modifying(
        flushAutomatically = true,
        clearAutomatically = true
    )
    @Query(
        value = """
                UPDATE students
                SET age = :newAge
                WHERE age = :oldAge
                """,
        nativeQuery = true
    )
    int updateStudentAgeNative(
            @Param("oldAge") Integer oldAge,
            @Param("newAge") Integer newAge
    );

    @Modifying(
        flushAutomatically = true,
        clearAutomatically = true
    )
    @Query(
        value = "DELETE FROM students WHERE age < :age",
        nativeQuery = true
    )
    int deleteStudentsYoungerThanNative(@Param("age") Integer age);

    
    @Query(
        """
        SELECT s
        FROM Student s
        JOIN FETCH s.department
        WHERE s.id = :id
        """
    )
    Optional<Student>findStudentWithDepartment(@Param("id") Long id);


    @Query("""
       SELECT s
       FROM Student s
       LEFT JOIN FETCH s.department
       WHERE s.id = :id
       """)
    Optional<Student> findStudentWithDepartmentIfNull(@Param("id") Long id);


    @Query("""
       SELECT DISTINCT s
       FROM Student s
       LEFT JOIN FETCH s.enrollments
       WHERE s.id = :id
       """)
    Optional<Student> findStudentWithEnrollments(@Param("id") Long id);


    @Query("""
       SELECT s
       FROM Student s
       LEFT JOIN FETCH s.enrollments e
       LEFT JOIN FETCH e.course
       WHERE s.id = :id
       """)
    Optional<Student> findStudentWithEnrollmentsAndCourses(
        @Param("id") Long id
    );


    @EntityGraph(attributePaths = {"department"})
    Optional<Student>findById(Long id);


    @EntityGraph(
        attributePaths = {
            "enrollments",
            "enrollments.course"
        }
    )
    Optional<Student>findStudentWithEnrollmentsAndCoursesById(Long id);
}