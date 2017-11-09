package com.greenfox.todo.repository;

import com.greenfox.todo.model.Assignee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssigneeRepository extends CrudRepository<Assignee, Long> {

    List<Assignee> findAll();
}
