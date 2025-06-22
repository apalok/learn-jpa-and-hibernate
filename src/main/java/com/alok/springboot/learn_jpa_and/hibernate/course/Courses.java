package com.alok.springboot.learn_jpa_and.hibernate.course;
public class Courses {

    private Long id;
    private String name;
    private String author;
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
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
