package com.oocl.todo.dto;
import com.oocl.todo.entity.Todo;

public class TodoRequest {

    private String content;

    public TodoRequest() {

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//    public static Todo to(TodoRequest todoRequest){
//        Todo todo = new Todo();
//        todo.setContent(todoRequest.getContent());
//        return todo;
//    }
}
