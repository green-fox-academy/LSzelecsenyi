package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repo.PostRepo;
import com.greenfox.reddit.service.RedditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reddit")
public class PostController {

    @Autowired
    PostRepo redditRepo;

    @Autowired
    RedditService redditService;


    @GetMapping({"", "/"})
    public String listPosts(Model model) {
        model.addAttribute("posts", redditService.listAll());
        return "listposts";
    }

    @GetMapping("/{id}/upvote")
    public String upVotePost(@PathVariable(value = "id") Long id) {
        Post post = redditRepo.findOne(id);
        redditService.upVote(post);
        return "redirect:/reddit";
    }

    @GetMapping("/{id}/downvote")
    public String downVotePost(@PathVariable(value = "id") Long id) {
        Post post = redditRepo.findOne(id);
        redditService.downVote(post);
        return "redirect:/reddit";
    }

    @PostMapping("/addnew")
    public String addNew(@RequestParam String content) {
        redditRepo.save(new Post(content));
        return "redirect:/reddit";
    }

}
