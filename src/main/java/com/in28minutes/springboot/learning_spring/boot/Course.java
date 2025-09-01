package com.in28minutes.springboot.learning_spring.boot;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {
    @JsonProperty
    private int id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String author;

    // No-argument constructor
    public Course() {
    }

    // All-arguments constructor
    public Course(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}