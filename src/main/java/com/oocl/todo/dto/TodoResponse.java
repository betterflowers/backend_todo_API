package com.oocl.todo.dto;

import com.oocl.todo.entity.Todo;

public class TodoResponse {

    private Integer id;
    private String content;
    private Boolean status;

    public TodoResponse() {

    }

    public TodoResponse(Integer id, String content, Boolean status) {
        this.id = id;
        this.content = content;
        this.status = status;
    }

    public static TodoResponse to(Todo todo){
        TodoResponse todoResponse = new TodoResponse();
        todoResponse.setId(todo.getId());
        todoResponse.setContent(todo.getContent());
        todoResponse.setStatus(todo.getStatus());
        return todoResponse;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
