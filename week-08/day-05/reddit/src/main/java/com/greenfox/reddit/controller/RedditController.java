package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repo.RedditRepo;
import com.greenfox.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reddit")
public class RedditController  {

    @Autowired
    RedditRepo redditRepo;

    @Autowired
    RedditService redditService;


    @GetMapping({"", "/"})
    public String listPosts(Model model) {
        model.addAttribute("posts", redditRepo.findAllByOrderByScoreDesc());
        return "listposts";
    }

    @GetMapping("/{id}/upvote")
    public String upVotePost(@PathVariable(value = "id") Long id) {
        Post post = redditRepo.findOne(id);
        redditService.plusScore(post);
        return "redirect:/reddit";
    }

    @GetMapping("/{id}/downvote")
    public String downVotePost(@PathVariable(value = "id") Long id) {
        Post post = redditRepo.findOne(id);
        redditService.minusScore(post);
        return "redirect:/reddit";
    }

}
