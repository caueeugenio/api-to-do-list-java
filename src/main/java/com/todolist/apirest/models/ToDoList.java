package com.todolist.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_TODOLIST")
public class ToDoList implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	

	private String title;
	
	
	private String status;
	
	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setId(long id) {
		this.id = id;
	}
}
