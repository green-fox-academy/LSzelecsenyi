package com.greenfox.todo.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;
    private LocalDate created;
    private LocalDate dueDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "assignee_id")
    private Assignee assignee;


    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
    }

    public Todo(String title, LocalDate created, LocalDate dueDate) {
        this.title = title;
        this.created = created;
        this.dueDate = dueDate;
    }

    public Todo(String title, boolean isUrgent, boolean isDone) {
        this.title = title;
        this.isDone = isDone;
        this.isUrgent = isUrgent;
        created = LocalDate.now();
        dueDate = LocalDate.now().plusDays(3);
    }

    public String getTitle() {
        return title;
    }

    public long getId() {
        return id;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsDone(boolean done) {
        isDone = done;
    }

    public boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }


}
