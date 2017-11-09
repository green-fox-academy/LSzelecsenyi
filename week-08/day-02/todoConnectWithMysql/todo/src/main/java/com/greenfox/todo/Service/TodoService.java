package com.greenfox.todo.Service;

import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public List<Todo> findActive(boolean isDone) {
        return todoRepository.findAllByIsDone(isDone);
    }

    public List<Todo> findByTitle(String title) {
        return todoRepository.findAllByTitle(title);
    }

    public List<Todo> findByCreated(LocalDate date) {
        return todoRepository.findAllByCreated(date);
    }

    public List<Todo> findByDueDate(LocalDate date) {
        return todoRepository.findAllByDueDate(date);
    }


}
