package com.oocl.todo.service;

import com.oocl.todo.dto.TodoRequest;
import com.oocl.todo.dto.TodoResponse;
import com.oocl.todo.entity.Todo;
import com.oocl.todo.exception.NoSuchDataException;
import com.oocl.todo.mapper.TodoMapper;
import com.oocl.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {


    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TodoResponse> getAllTodo() {
        return this.todoRepository.findAll().stream()
                .map(TodoMapper::toTodoResponse)
                .collect(Collectors.toList());
    }

    public List<TodoResponse> deleteTodoById(Integer id) {
        this.todoRepository.deleteById(id);
        return getAllTodo();
    }

    public List<TodoResponse> addTodo(TodoRequest todoRequest) {
        TodoMapper.toTodoResponse(this.todoRepository.save(TodoMapper.toTodo(todoRequest)));
        return getAllTodo();
    }

    public List<TodoResponse> changeTodoItemStatusById (Integer id) throws Exception{
        Todo todo = this.todoRepository.findById(id).orElseThrow(Exception::new);
        todo.setStatus(!todo.getStatus());
        todoRepository.save(todo);
        return getAllTodo();
    }


}
