package com.todolist.apirest.resources;

import java.util.List;

import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.apirest.models.ToDoList;
import com.todolist.apirest.repository.ToDoListRepository;

@RestController
@RequestMapping(value="/api")
public class ToDoListResource {
	@Autowired
	ToDoListRepository toDoListRepository;
	
	@GetMapping("/tasks")
	public List<ToDoList> listTasks(){
		return toDoListRepository.findAll();
	}
	@GetMapping("/tasks/{id}")
	public ToDoList findTask(@PathVariable(value="id")long id ){
		return toDoListRepository.findById(id);
	}
	@PostMapping("/task")
	public ToDoList saveTask(@RequestBody ToDoList newTask) {
		return toDoListRepository.save(newTask);
		
	}
	@DeleteMapping("/task")
	public void deleteTask(@RequestBody ToDoList task) {
		 toDoListRepository.delete(task);
		
	}
}
