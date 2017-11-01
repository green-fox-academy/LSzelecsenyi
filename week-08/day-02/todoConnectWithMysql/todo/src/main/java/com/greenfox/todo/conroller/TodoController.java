package com.greenfox.todo.conroller;

import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
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
        return new ModelAndView("redirect:/posts");
    }

    @RequestMapping(value = "/list/{id}/delete", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable long id) {
        todoRepository.delete(id);
        return  new ModelAndView("redirect:/list");
    }


}
