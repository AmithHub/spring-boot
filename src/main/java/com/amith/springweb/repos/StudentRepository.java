package com.amith.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amith.springweb.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
