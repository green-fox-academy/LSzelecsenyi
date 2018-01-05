package com.greenfox.todo.conroller;

import com.greenfox.todo.Service.AssigneeService;
import com.greenfox.todo.Service.TodoService;
import com.greenfox.todo.model.Todo;
import com.greenfox.todo.repository.AssigneeRepository;
import com.greenfox.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    private AssigneeService assigneeService;

    @Autowired
    private TodoService todoService;

//list todos

    @RequestMapping("")
    public String list(Model model) {
        model.addAttribute("todos", todoService.listTodos());
        return "todo";
    }

//add new todo

    @GetMapping("/addnewtodo")
    public String newTodo(Model model) {
        model.addAttribute("newTodo", new Todo());
        return "newtodo";
    }

    @PostMapping("/create")
    public String create(@RequestParam String title, @RequestParam String dueDate) {
        todoService.createTodo(new Todo(title, LocalDate.now(), LocalDate.parse(dueDate)));
        return "redirect:/todo";
    }

//delete todo

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable long id) {
        todoService.deleteTodo(id);
        return ("redirect:/todo");
    }

    @GetMapping("/{id}/deleteonactives")
    public String deleteOnActivesPage(@PathVariable long id) {
        todoService.deleteTodo(id);
        return ("redirect:/todo/actives");
    }

//edit todo

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable long id, Model model) {
        Todo todo = todoRepository.findOne(id);
        model.addAttribute("assignees", assigneeRepository.findAll());
        model.addAttribute("todo", todo);
        return "edittodo";
    }

    @GetMapping("/{id}/editonactives")
    public String editOnActivesPage(@PathVariable long id, Model model) {
        Todo todo = todoRepository.findOne(id);
        model.addAttribute("assignees", assigneeRepository.findAll());
        model.addAttribute("todo", todo);
        return "edittodo";
    }

    @PostMapping("/list/{id}/edit")
    public String edit(@ModelAttribute Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo";
    }

//SEARCHING FEATURES

    @GetMapping("/actives")
    public String listActive(Model model) {
        List actives = todoService.findActive(false);
        model.addAttribute("actives", actives);
        return "actives";
    }

    @RequestMapping("/completed/{id}")
    public String toggleCompleted(@PathVariable long id) {
        Todo temp = todoRepository.findOne(id);
        temp.setIsDone(!temp.getIsDone());
        todoRepository.save(temp);
        return "redirect:/todo";
    }

    @RequestMapping("/completeonactives/{id}")
    public String toggleCompletedOnActives(@PathVariable long id) {
        Todo temp = todoRepository.findOne(id);
        temp.setIsDone(!temp.getIsDone());
        todoRepository.save(temp);
        return "redirect:/todo/actives";
    }

    @GetMapping("/bydatecreated")
    public String findByCreatedDate(Model model, @RequestParam String date) {
        List listByDate = todoService.findByCreated(LocalDate.parse(date));
        model.addAttribute("listByDate", listByDate);
        return "bydate";
    }

    @GetMapping("/bydatedue")
    public String findByDueDate(Model model, @RequestParam String date) {
        List listByDate = todoService.findByDueDate(LocalDate.parse(date));
        model.addAttribute("listByDate", listByDate);
        return "bydate";
    }

    @GetMapping("/bytitle")
    public String findByTitle(Model model, String title) {
        List byTitle = todoService.findByTitle(title);
        model.addAttribute("byTitle", byTitle);
        return "bytitle";
    }

    @GetMapping("/byassignee")
    public String findByAssignee(Model model, String assignee) {
        List byAssignee = todoService.findByAssignee(assignee);
        model.addAttribute("byAssignee", byAssignee);
        return "byassignee";
    }

}




























