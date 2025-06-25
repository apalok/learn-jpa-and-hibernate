package com.alok.springboot.learn_jpa_and.hibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.alok.springboot.learn_jpa_and.hibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);

    }
    public Course findCourseById(long id){
        return entityManager.find(Course.class, id);
    }

    public void deleteCourseById(long id){
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

}
