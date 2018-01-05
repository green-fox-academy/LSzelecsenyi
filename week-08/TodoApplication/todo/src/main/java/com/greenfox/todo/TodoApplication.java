package com.greenfox.todo;

import com.greenfox.todo.model.Assignee;
import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repository.AssigneeRepository;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public static final String START_THE_DAY = "Start the day";

    @Autowired
    TodoRepository todoRepository;
    @Autowired
    AssigneeRepository assigneeRepository;

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (todoRepository.count() == 0) {
            todoRepository.save(new Todo(START_THE_DAY, true, false));
            todoRepository.save(new Todo("Play cards", true, false));
            todoRepository.save(new Todo("Laugh a lot", false, true));
            todoRepository.save(new Todo("Ride bike", true, false));
            todoRepository.save(new Todo("Drink beer", true, false));
            todoRepository.save(new Todo("Code a bit", true, false));
        } if (assigneeRepository.count() == 0) {
            assigneeRepository.save(new Assignee("Mikorka Kalman", "mikorkakalman@gmail.com"));
            assigneeRepository.save(new Assignee("Metal Ica", "metallica@gmail.com"));
        }
    }
}
