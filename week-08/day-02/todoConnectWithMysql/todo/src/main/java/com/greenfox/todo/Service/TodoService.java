package com.greenfox.todo.Service;

import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoRepository todoRepository;

    public List<Todo> listTodos() { return (List) todoRepository.findAll();}

    public void createTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        todoRepository.delete(id);
    }

    public List<Todo> findActive(boolean isDone) {
        return todoRepository.findAllByIsDone(isDone);
    }

    public List<Todo> findByTitle(String title) {
        return todoRepository.findAllByTitleIsContaining(title);
    }

    public List<Todo> findByCreated(LocalDate date) {
        return todoRepository.findAllByCreated(date);
    }

    public List<Todo> findByDueDate(LocalDate date) {
        return todoRepository.findAllByDueDate(date);
    }

    public List<Todo> findByAssignee(String assignee) {
        return todoRepository.findAllByAssigneeNameIs(assignee);
    }
}
