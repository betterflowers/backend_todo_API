package com.oocl.todo.controller;


import com.oocl.todo.dto.TodoResponse;
import com.oocl.todo.entity.Todo;
import com.oocl.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

//    @PostMapping
//    public TodoResponse addTodo(@RequestBody TodoRequest todoRequest){
//        return todoService.addTodo(todoRequest);
//    }

    @GetMapping
    public List<TodoResponse> getAllTodo(){
        return todoService.getAllTodo();
    }

    @DeleteMapping("/{id}")
    public List<TodoResponse> deleteTodoById(@PathVariable Integer id){
        return todoService.deleteTodoById(id);
    }
}
