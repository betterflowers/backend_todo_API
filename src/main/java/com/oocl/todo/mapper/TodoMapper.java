package com.oocl.todo.mapper;

import com.oocl.todo.dto.TodoRequest;
import com.oocl.todo.dto.TodoResponse;
import com.oocl.todo.entity.Todo;

public class TodoMapper {

    public static TodoResponse toTodoResponse(Todo todo){
        return new TodoResponse(todo.getId(),todo.getContent(),todo.getStatus());
    }

    public static Todo toTodo(TodoRequest todoRequest){
        return new Todo(todoRequest.getContent(),false);
    }



}
