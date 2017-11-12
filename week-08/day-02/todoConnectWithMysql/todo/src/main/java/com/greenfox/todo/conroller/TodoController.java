package com.greenfox.todo.conroller;

import com.greenfox.todo.Service.TodoService;
import com.greenfox.todo.model.Assignee;
import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repository.AssigneeRepository;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private AssigneeRepository assigneeRepository;

    @Autowired
    private TodoService todoService;

    
    @RequestMapping({"", "/", "/list"})
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "todo";
    }

    @GetMapping("/list/addnewtodo")
    public String newTodo(Model model) {
        model.addAttribute("newTodo", new Todo());
        return "addtodo";
    }

    @PostMapping(value = "/list/create")
    public String create(@RequestParam String title, @RequestParam String dueDate) {
        todoRepository.save(new Todo(title, LocalDate.now(), LocalDate.parse(dueDate)));
        return "redirect:/todo/";
    }

    @DeleteMapping("/list/{id}/delete")
    public ModelAndView delete(@PathVariable long id) {
        todoRepository.delete(id);
        return  new ModelAndView("redirect:/todo/list");
    }

    @GetMapping("/list/{id}/edit")
    public String edit(@PathVariable long id, Model model) {
        Todo todo = todoRepository.findOne(id);
        model.addAttribute("assignees", assigneeRepository.findAll());
        model.addAttribute("todo", todo);
        return "edittodo";
    }

    @PostMapping("/list/{id}/edit")
    public String edit(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo/";
    }

    @GetMapping("/actives")
    public String listActive(Model model) {
        List actives = todoRepository.findAllByIsDone(false);
        model.addAttribute("actives", actives);
        return "actives";
    }

    @GetMapping("/bydatecreated")
    public String findByCreatedDate(Model model, @RequestParam String date) {
        List listByDate = todoRepository.findAllByCreated(LocalDate.parse(date));
        model.addAttribute("listByDate", listByDate);
        return "bydate";
    }

    @GetMapping("/bydatedue")
    public String findByDueDate(Model model, @RequestParam String date) {
        List listByDate = todoRepository.findAllByDueDate(LocalDate.parse(date));
        model.addAttribute("listByDate", listByDate);
        return "bydate";
    }

    @GetMapping("/bytitle")
    public String findByTitle(Model model, String title) {
        List byTitle = todoRepository.findAllByTitle(title);
        model.addAttribute("byTitle", byTitle);
        return "bytitle";
    }


    @PostMapping("/list/assignassignee/{todoId}/{assigneeId}")
    public String assignAssignee(@RequestParam(value = "todoId") long todoId,
                                 @RequestParam(value = "assigneeId") long assigneeId,
                                 Model model) {
        model.addAttribute("assignees", assigneeRepository.findAll());
        Todo selectedTodo = todoRepository.findOne(todoId);
        Assignee assignee = assigneeRepository.findOne(assigneeId);
        selectedTodo.setAssignee(assignee);
        todoRepository.save(selectedTodo);
        return "redirect:/todo";
    }

}




























