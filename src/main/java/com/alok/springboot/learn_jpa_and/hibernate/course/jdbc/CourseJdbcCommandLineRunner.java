package com.alok.springboot.learn_jpa_and.hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{
    @Autowired
    private CoursesJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        repository.insert();
    }
    

}
