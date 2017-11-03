package com.greenfox.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String post;
    private int score;

    public Post(String post, int score) {
        this.post = post;
        this.score = score;
    }

    public Post(String post) {
        this.post = post;
        score = 0;
    }

    public Post() {

    }

    public Long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
