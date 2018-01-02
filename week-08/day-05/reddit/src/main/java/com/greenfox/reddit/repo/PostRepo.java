package com.greenfox.reddit.repo;

import com.greenfox.reddit.model.Post;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {
}
