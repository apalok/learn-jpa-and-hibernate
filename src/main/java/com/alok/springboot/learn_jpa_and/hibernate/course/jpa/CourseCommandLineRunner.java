package com.alok.springboot.learn_jpa_and.hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.alok.springboot.learn_jpa_and.hibernate.course.Course;
//import com.alok.springboot.learn_jpa_and.hibernate.course.jdbc.CoursesJdbcRepository;
@Component
public class CourseCommandLineRunner implements CommandLineRunner{
 //   @Autowired
  //  private CoursesJdbcRepository repository;
    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
    
        repository.insert(new Course((long) 4, "learn java springboot", "Alok"));
        repository.insert(new Course((long) 5, "learn java script", "Alok"));
        repository.insert(new Course((long) 6, "learn NodeJs", "Alok"));
        repository.deleteCourseById((long) 4);
        System.out.println(repository.findCourseById((long)5));
    }
    

}
