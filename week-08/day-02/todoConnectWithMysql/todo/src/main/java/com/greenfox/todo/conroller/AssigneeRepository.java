package com.greenfox.todo.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/assignees")
public class AssigneeRepository {

    @Autowired
    private com.greenfox.todo.repository.AssigneeRepository assigneeRepository;


    @RequestMapping({"", "/"})
    public String listAssignees(Model model) {
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "assignees";
    }


}
