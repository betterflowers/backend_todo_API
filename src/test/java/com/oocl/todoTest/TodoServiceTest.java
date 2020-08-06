package com.oocl.todoTest;

import com.oocl.todo.dto.TodoRequest;
import com.oocl.todo.dto.TodoResponse;
import com.oocl.todo.entity.Todo;
import com.oocl.todo.repository.TodoRepository;
import com.oocl.todo.service.TodoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class TodoServiceTest {
    @InjectMocks
    private TodoService todoService;

    @Mock
    private TodoRepository todoRepository;

    @Test
    public void should_return_todos_when_getAllTodos_given_() {
        //given
        when(todoRepository.findAll()).thenReturn(getMockTodos());
        //when
        List<TodoResponse> todoResponses = todoService.getAllTodo();
        //then
        assertEquals(2,todoResponses.size());
    }

    @Test
    @DisplayName("")
    void should_validate_delete_when_deleteById_given_id() {
        //given
        when(todoRepository.findAll()).thenReturn(getMockTodos());
        //when
        todoService.deleteTodoById(1);
        //then
        verify(todoRepository).deleteById(eq(1));

}

    @Test
    @DisplayName("")
    void should_return_todos_when_save_todo_given_todo() {
        //given
        TodoRequest todoRequest = new TodoRequest();
        todoRequest.setContent("");
        when(todoRepository.findAll()).thenReturn(getMockTodos());
        when(todoRepository.save(isA(Todo.class))).thenReturn(new Todo());
        //when
        List<TodoResponse> todoResponses = todoService.addTodo(todoRequest);
        //then
        assertEquals(2,todoResponses.size());
    }



    private List<Todo> getMockTodos(){
        return Arrays.asList(new Todo(),new Todo());
    }



}
