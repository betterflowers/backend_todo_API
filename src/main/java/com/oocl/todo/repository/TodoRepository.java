package com.oocl.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.oocl.todo.entity.Todo

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {

}
