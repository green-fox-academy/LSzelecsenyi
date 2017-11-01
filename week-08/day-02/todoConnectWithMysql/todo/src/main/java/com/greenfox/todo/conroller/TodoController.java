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

    @RequestMapping(value =  "/new", method = RequestMethod.GET)
    public String newTodo() {
        return "add";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ModelAndView create(@RequestParam("title") String comment) {
        todoRepository.save(new Todo(comment));
        return new ModelAndView("redirect:/todo/");
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        todoRepository.delete(id);
        return  new ModelAndView("redirect:/todo/list");
    }

    @RequestMapping(value = "{id}/edit", method = RequestMethod.GET)
    public String edit(@PathVariable long id,
                       Model model) {
        Todo todo = todoRepository.findOne(id);
        model.addAttribute("todo", todo);
        return "edit";
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ModelAndView update(@RequestParam("title") String title,
                               @RequestParam("todoId") long id) {
        Todo todo = todoRepository.findOne(id);
        todo.setTitle(title);
        todoRepository.save(todo);
        System.out.println(todo.getId());
        System.out.println(todo.getTitle());
        return new ModelAndView("redirect:/todo/list");
    }


}
