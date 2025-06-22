package com.alok.springboot.learn_jpa_and.hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.alok.springboot.learn_jpa_and.hibernate.course.Courses;
@Repository
public class CoursesJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY = """
            insert into courses (id, name, author) VALUES (1, 'Learn Java', 'ALOK');
            """;

    public void insert(){
        springJdbcTemplate.update(INSERT_QUERY);
    }

}
