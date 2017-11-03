package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repo.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RedditService {

    @Autowired
    RedditRepo redditRepo;

    public void minusScore(Post post) {
        post.setScore(post.getScore() - 1);
        redditRepo.save(post);
    }

    public void plusScore(Post post) {
        post.setScore(post.getScore() + 1);
        redditRepo.save(post);
    }

}
