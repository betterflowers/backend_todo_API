package com.oocl.todoTest;

import com.oocl.todo.dto.TodoResponse;
import com.oocl.todo.entity.Todo;
import com.oocl.todo.repository.TodoRepository;
import com.oocl.todo.service.TodoService;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TodoServiceTest {
    @InjectMocks
    private TodoService todoService;

    @Mock
    private TodoRepository todoRepository;

    @Test
//    public void should_return_todos_when_getAllTodos_given_() {
//        //given
//        when(todoRepository.findAll()).thenReturn(getMockTodos());
//        //when
//        List<TodoResponse> todoResponses = todoService.getAllTodo();
//        //then
//        assertEquals(3,todoResponses.size());
//    }
//
//    private List<Todo> getMockTodos(){
//        return Arrays.asList(new Todo(),new Todo());
    }



}
