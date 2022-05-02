package com.demo.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.TodoDTO;
import com.demo.repository.TodoRepository;

@RestController
public class TodoController {

	@Autowired
	private TodoRepository todoRepo;
	@GetMapping("/todos")
	public ResponseEntity<?> getAllTodos(){
		List<TodoDTO> list=todoRepo.findAll();
	    if(list.size()>0) {
	    	return new ResponseEntity<List<TodoDTO>>(list,HttpStatus.OK);
	    }else {
	    	return new ResponseEntity<>("No Todos Available",HttpStatus.NOT_FOUND);
	    }
	}
	@PostMapping("/todos")
	public ResponseEntity<?> createTodos(@RequestBody TodoDTO todo){
		try {
		todo.setCreatedOn( new Date(System.currentTimeMillis()));
		todoRepo.save(todo);
		return new ResponseEntity<TodoDTO>(todo,HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/todos/{CenterName}")
	public ResponseEntity<?> getTodosById(@PathVariable String CenterName){
		Optional<TodoDTO> todos=todoRepo.findById(CenterName);
		if(todos.isPresent()) {
			return new ResponseEntity<>(todos,HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Todo is not found",HttpStatus.NOT_FOUND);
		}
	}
	
}
