package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    @Autowired
    EntityManager entityManager;

    public void downVote(Post post) {
        post.setScore(post.getScore() - 1);
        postRepo.save(post);
    }

    public void upVote(Post post) {
        post.setScore(post.getScore() + 1);
        postRepo.save(post);
    }
}
