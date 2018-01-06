package com.greenfox.todo.conroller;

import com.greenfox.todo.Service.AssigneeService;
import com.greenfox.todo.model.Assignee;
import com.greenfox.todo.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/assignees")
public class AssigneeController {

    @Autowired
    private AssigneeRepository assigneeRepository;

    @Autowired
    private AssigneeService assigneeService;

//list assignees

    @GetMapping({"", "/"})
    public String listAssignees(Model model) {
        model.addAttribute("assignees", assigneeService.listAssignees());
        return "assignees";
    }

//add new assignee

    @GetMapping("/addnewassignee")
    public String newAssignee(Model model) {
        model.addAttribute("newAssignee", new Assignee());
        return "addassignee";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/assignees";
    }

    @GetMapping

//delete assignee

    @DeleteMapping("/{id}/delete")
    public String deleteAssignee(@PathVariable Long id) {
        assigneeRepository.delete(id);
        return"redirect:/assignees";
    }

//edit assignee

    @GetMapping("/{id}/edit")
    public String editAssignee(@PathVariable long id, Model model) {
        Assignee assignee = assigneeRepository.findOne(id);
        model.addAttribute("assignee", assignee);
        return"editassignee";
    }

    @PostMapping("/{id}/edit")
    public String editAssignee(@ModelAttribute Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/assignees";
    }
}
