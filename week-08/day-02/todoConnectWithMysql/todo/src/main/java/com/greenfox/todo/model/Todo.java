package com.greenfox.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;

    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
    }

    public Todo(String title, boolean isUrgent, boolean isDone) {
        this.title = title;
        this.isDone = isDone;
        this.isUrgent = isUrgent;
    }

    public String getTitle() {
        return title;
    }

    public long getId() {
        return id;
    }

    public boolean getIsUrgent() {
        return isUrgent;
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

    public void setIsUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public void setIsDone(boolean done) {
        isDone = done;
    }
}
