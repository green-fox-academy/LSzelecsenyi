package com.greenfox.todo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Assignees")
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Todo> todos;

//    public void addTodos(List<Todo> listOfTodos) {
//        for (Todo todo : listOfTodos) {
//            todos.add(todo);
//            todo.setAssignee(this);
//        }
//    }
//
//    public void removeTodo(Todo todo) {
//        todos.remove(todo);
//        todo.setAssignee(null);
//    }

    public Assignee() {
    }

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public List<Todo> getTodos() { return todos; }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
