package com.greenfox.todo;

import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner{

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("Start the day"));
		todoRepository.save(new Todo("Finish H2 workshop1"));
		todoRepository.save(new Todo("Finish JPA workshop2"));
		todoRepository.save(new Todo("Create a CRUD prooject"`));
		todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
		todoRepository.save(new Todo("I have to practice it too"));
	}
}
