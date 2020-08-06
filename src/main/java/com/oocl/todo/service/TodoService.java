package com.oocl.todo.service;

import com.oocl.todo.dto.TodoRequest;
import com.oocl.todo.dto.TodoResponse;

import java.util.List;

public interface TodoService {

    List<TodoResponse> addTodo(TodoRequest todoRequest);
}
