package com.greenfox.todo.repository;

import com.greenfox.todo.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findAllByIsDone(boolean isDone);
    List<Todo> findAllByTitle(String title);
    List<Todo> findAllByCreated(LocalDate date);
    List<Todo> findAllByDueDate(LocalDate date);

}
