package com.greenfox.reddit;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}

    @Autowired
    PostRepo redditRepo;

	@Override
	public void run(String... args) throws Exception {
		if (redditRepo.count() == 0) {
            for (int i = 0; i <= 20; i++) {
                redditRepo.save(new Post(i + 1 + " post"));
            }
		}
	}
}
