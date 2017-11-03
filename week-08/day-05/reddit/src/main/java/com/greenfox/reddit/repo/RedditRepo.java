package com.greenfox.reddit.repo;

import com.greenfox.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface RedditRepo extends CrudRepository<Post, Long> {
}
