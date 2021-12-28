package com.todolist.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.apirest.models.ToDoList;

public interface ToDoListRepository extends JpaRepository<ToDoList, Long>{

	ToDoList findById(long id);
}
