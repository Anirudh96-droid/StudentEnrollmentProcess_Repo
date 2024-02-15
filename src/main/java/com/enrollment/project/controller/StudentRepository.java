package com.enrollment.project.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enrollment.project.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
