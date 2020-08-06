package com.oocl.todo.entity;

import javax.persistence.*;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;
    private Boolean status;

    public Todo(String content, Boolean status) {
        this.content = content;
        this.status = status;
    }

    public Todo() {

    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Boolean getStatus() {
        return status;
    }
}
