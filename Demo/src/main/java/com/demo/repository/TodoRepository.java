package com.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.TodoDTO;

@Repository
public interface TodoRepository  extends MongoRepository<TodoDTO,String>{

	List<TodoDTO> findAll();
	@Query("{'todo'? :0}")
	Optional<TodoDTO> findByTodo(String todo);

	
}
