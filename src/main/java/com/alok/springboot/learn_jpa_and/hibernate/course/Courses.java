package com.alok.springboot.learn_jpa_and.hibernate.course;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class Courses {
    @Id
    private Long id;
    private String name;
    private String author;
    public Courses(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    public Courses() {
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    @Override
    public String toString() {
        return "Courses [id=" + id + ", name=" + name + ", author=" + author + "]";
    }

}
