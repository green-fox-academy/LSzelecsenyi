package com.greenfox.todo.Service;

import com.greenfox.todo.model.Assignee;
import com.greenfox.todo.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeService {

    @Autowired
    AssigneeRepository assigneeRepository;

    public List<Assignee> listAssignees() { return (List) assigneeRepository.findAll();}

}
