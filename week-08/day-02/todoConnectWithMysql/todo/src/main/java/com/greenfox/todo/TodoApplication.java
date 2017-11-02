package com.greenfox.todo;

import com.greenfox.todo.model.Assignee;
import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repository.AssigneeRepository;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner{

	@Autowired
	TodoRepository todoRepository;
	@Autowired
	AssigneeRepository assigneeRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("Start the day", true, false));
		todoRepository.save(new Todo("Play cards with Bori", true, false));
		todoRepository.save(new Todo("Laugh a lot together", false, true));
		todoRepository.save(new Todo("Ride bike", true, false));
		todoRepository.save(new Todo("Drink beer", true, false));
		todoRepository.save(new Todo("Code a bit", true, false));
		assigneeRepository.save(new Assignee("Mikorka Kalman", "mikorkakalmangmail.com"));
		assigneeRepository.save(new Assignee("Metal Ica", "metallicamail.com"));
	}
}
