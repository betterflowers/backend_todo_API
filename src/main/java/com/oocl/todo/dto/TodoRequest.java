package com.oocl.todo.dto;

public class TodoRequest {

    private String content;

    public TodoRequest(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    public static requestMapToEntity(){
//
//    }
}
