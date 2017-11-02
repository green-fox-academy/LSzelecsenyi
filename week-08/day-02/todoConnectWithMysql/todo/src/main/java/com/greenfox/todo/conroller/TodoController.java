package com.greenfox.todo.conroller;

import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

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
        return "addtodo";
    }

    @PostMapping(value = "/list/create")
    public String create(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/";
    }

    @DeleteMapping("/{id}/delete")
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

    @GetMapping("/actives")
    public String listActive(Model model) {
        List actives = todoRepository.findAllByIsDone(false);
        model.addAttribute("actives", actives);
        return "actives";
    }

//    @GetMapping("/actives")
//    public String listActiveOnSameSite(@RequestParam boolean isDone) {
//        List actives = todoRepository.findAllByIsDone(false);
//        model.addAttribute("actives", actives);
//        return "todo";
//    }

    @GetMapping("/bydate")
    public String findByDate(Model model, @RequestParam String date) {
        final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        final LocalDate formattedDate = LocalDate.parse(date);
        List listByDate = todoRepository.findAllByCreated(formattedDate);
        model.addAttribute("listByDate", listByDate);
        return "bydate";
    }

    @GetMapping("/bytitle")
    public String findByTitle(Model model, String title) {
        List byTitle = todoRepository.findAllByTitle(title);
        model.addAttribute("byTitle", byTitle);
        return "bytitle";
    }


}




























