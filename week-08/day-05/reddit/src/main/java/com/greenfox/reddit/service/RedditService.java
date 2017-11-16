package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RedditService {

    @Autowired
    PostRepo redditRepo;

    public List<Post> listAll() {
        return redditRepo.findAllByOrderByScoreDesc();
    }

    public void downVote(Post post) {
        post.setScore(post.getScore() - 1);
        redditRepo.save(post);
    }

    public void upVote(Post post) {
        post.setScore(post.getScore() + 1);
        redditRepo.save(post);
    }

}
