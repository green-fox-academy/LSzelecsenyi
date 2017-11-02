package com.greenfox.todo.conroller;

import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repository.AssigneeRepository;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @RequestMapping
    public String todo(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todo";
    }

    @RequestMapping({"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todo";
    }

    @GetMapping("/list/addnewtodo")
    public String newTodo(Model model) {
        model.addAttribute("newTodo", new Todo());
        return "addtodo";
    }

    @PostMapping(value = "/list/create")
    public String create(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        todoRepository.delete(id);
        return  new ModelAndView("redirect:/todo/list");
    }

    @GetMapping("/list/{id}/edit")
    public String edit(@PathVariable long id, Model model) {
        Todo todo = todoRepository.findOne(id);
        model.addAttribute("todo", todo);
        return "edittodo";
    }

    @PostMapping("/list/{id}/edit")
    public String edit(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo";
    }

    @GetMapping("/assignees")
    public String listAssignees(Model model) {
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "assignees";
    }

    @GetMapping("/actives")
    public String listActive(Model model) {
        List actives = todoRepository.findAllByIsDone(false);
        model.addAttribute("actives", actives);
        return "actives";
    }


}




























