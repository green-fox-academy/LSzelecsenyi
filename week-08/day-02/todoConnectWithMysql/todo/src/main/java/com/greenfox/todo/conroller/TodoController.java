package com.greenfox.todo.conroller;

import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

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
        return "add";
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
        return "edit";
    }

    @PostMapping("/list/{id}/edit")
    public String edit(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo";
    }


}
