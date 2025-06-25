package com.alok.springboot.learn_jpa_and.hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.alok.springboot.learn_jpa_and.hibernate.course.Course;
@Repository
public class CoursesJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY = """
            insert into courses (id, name, author) VALUES (?, ?, ?);
            """;
    private static String DELETE_QUERY = """
            delete from courses where id = ?;
            """;
    private static String SELECT_QUERY = """
            select * from courses where id = ?;
            """;
    private static String TRUNCATE_QUERY = """
            truncate table courses;
            """;

    public void insert(Course courses){
        springJdbcTemplate.update(INSERT_QUERY, courses.getId(), courses.getName(), courses.getAuthor());
    }

    public void delete(Long id){
        springJdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course findById(long id){
       return springJdbcTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class) ,id);
    }

    /**
     * @return
     */
    public void truncate(){
       springJdbcTemplate.execute(TRUNCATE_QUERY);
    }

}
