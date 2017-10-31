package com.greenfox.todo.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;x
import com.greenfox.todo.repository.TodoRepository;

@Controller
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @RequestMapping
    public String todo() {
        return "todo";
    }

    @RequestMapping({"/", "/list"})
    public String list(Model model) {
        return "todo";
    }
}
