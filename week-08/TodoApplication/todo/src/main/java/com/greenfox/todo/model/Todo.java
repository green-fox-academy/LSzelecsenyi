package com.greenfox.todo.model;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;
    private LocalDateTime created;
    private LocalDateTime dueDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "assignee_id")
    private Assignee assignee;


    public Todo() {
    }

    public Todo(String title) {
        this.title = title;
    }

    public Todo(String title, LocalDateTime dueDate, boolean isUrgent) {
        this.title = title;
        this.dueDate = dueDate;
        this.isUrgent = isUrgent;
        this.created = LocalDateTime.now();
    }

    public Todo(String title, boolean isUrgent, boolean isDone, LocalDateTime created, LocalDateTime dueDate) {
        this.title = title;
        this.isDone = isDone;
        this.isUrgent = isUrgent;
        this.created = created;
        this.dueDate = dueDate;
    }

    public String createdXAgo() {
        long minutes = Duration.between(this.created, LocalDateTime.now()).toMinutes();
        if (minutes < 60) {
            return minutes + " minutes ago";
        } else if (minutes >= 60 && minutes < 1440) {
            return minutes / 60 + " hours ago";
        } else
        return minutes / 1440 + " days ago";
    }

    public String dueInX() {
        Duration toDue = Duration.between(LocalDateTime.now(), this.dueDate);
        if (toDue.toMillis() <= 0) {
            return "Overdue";
        } else if (toDue.toMillis() > 0 && toDue.toMinutes() < 60) {
            return "Due in " + toDue.toMinutes() + " minutes";
        } else if (toDue.toMinutes() <= 60 || toDue.toMinutes() < 1440) {
            return "Due in " + toDue.toHours() + " hours";
        } else return "Due in " + toDue.toDays() + " days";
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

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }


}
