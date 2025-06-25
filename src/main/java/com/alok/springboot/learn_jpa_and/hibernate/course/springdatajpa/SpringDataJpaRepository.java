package com.alok.springboot.learn_jpa_and.hibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alok.springboot.learn_jpa_and.hibernate.course.Course;

public interface SpringDataJpaRepository extends JpaRepository <Course, Long>{

}
