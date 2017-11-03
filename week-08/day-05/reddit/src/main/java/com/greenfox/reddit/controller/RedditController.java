package com.greenfox.reddit.controller;

import com.greenfox.reddit.repo.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reddit")
public class RedditController  {

    @Autowired
    RedditRepo redditRepo;

    @GetMapping({"", "/"})
    public String listPosts(Model model) {
        model.addAttribute("posts", redditRepo.findAll());
        return "listposts";
    }

}
