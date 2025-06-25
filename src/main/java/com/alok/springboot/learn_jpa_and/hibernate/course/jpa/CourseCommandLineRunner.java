package com.alok.springboot.learn_jpa_and.hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.alok.springboot.learn_jpa_and.hibernate.course.Course;
import com.alok.springboot.learn_jpa_and.hibernate.course.springdatajpa.SpringDataJpaRepository;
//import com.alok.springboot.learn_jpa_and.hibernate.course.jdbc.CoursesJdbcRepository;
@Component
public class CourseCommandLineRunner implements CommandLineRunner{
 //   @Autowired
  //  private CoursesJdbcRepository repository;
    // @Autowired
    // private CourseJpaRepository repository;
    @Autowired
    private  SpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
    
       // repository.insert(new Course((long) 1, "learn java springboot", "Alok"));
       // repository.insert(new Course((long) 2, "learn java script", "Alok"));
        // repository.insert(new Course((long) 3, "learn NodeJs", "Alok"));
       // repository.deleteCourseById((long) 1);
        // System.out.println(repository.findCourseById((long)3));

        repository.save(new Course((long) 1, "learn java springboot", "Alok"));
        repository.save(new Course((long) 2, "learn java script", "Alok"));
        repository.save(new Course((long) 3, "learn NodeJs", "Alok"));
        repository.deleteById((long) 1);
        System.out.println(repository.findById((long)3));
    }
    

}
