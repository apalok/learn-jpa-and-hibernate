package com.alok.springboot.learn_jpa_and.hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alok.springboot.learn_jpa_and.hibernate.course.Course;

public interface SpringDataJpaRepository extends JpaRepository <Course, Long>{

    List<Course> findByAuthor(String author);

}
