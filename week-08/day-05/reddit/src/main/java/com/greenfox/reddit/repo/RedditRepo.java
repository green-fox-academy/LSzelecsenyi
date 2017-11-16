package com.greenfox.reddit.repo;

import com.greenfox.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RedditRepo extends CrudRepository<Post, Long> {

    List<Post> findAllByOrderByScoreDesc();
}
