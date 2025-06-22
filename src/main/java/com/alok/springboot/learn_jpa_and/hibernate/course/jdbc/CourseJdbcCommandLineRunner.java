package com.alok.springboot.learn_jpa_and.hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.alok.springboot.learn_jpa_and.hibernate.course.Courses;
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
    @Autowired
    private CoursesJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
    
        repository.insert(new Courses((long) 4, "learn java springboot", "Alok"));
        repository.insert(new Courses((long) 5, "learn java script", "Alok"));
        repository.insert(new Courses((long) 6, "learn NodeJs", "Alok"));
        repository.delete((long) 4);
        System.out.println(repository.findById((long)5));
        repository.truncate();
    }
    

}
