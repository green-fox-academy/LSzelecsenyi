package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repo.PostRepo;
import com.greenfox.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @Autowired
    PostRepo postRepo;

    @Autowired
    PostService postService;

    @GetMapping({"", "/"})
    public String listPosts(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("posts", postRepo.findAll(new PageRequest(page, 5, Sort.Direction.DESC, "score")));
        model.addAttribute("currentPage", page);
        return "posts";
    }


    @PostMapping("/save")
    public String save(Post post) {
        postRepo.save(post);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(Integer id) {
        postRepo.delete(id);
        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Post findOne(Integer id) {
        return postRepo.findOne(id);
    }

    @GetMapping("/{id}/upvote")
    public String upVotePost(@PathVariable(value = "id") Integer id) {
        Post post = postRepo.findOne(id);
        postService.upVote(post);
        return "redirect:/";
    }

    @GetMapping("/{id}/downvote")
    public String downVotePost(@PathVariable(value = "id") Integer id) {
        Post post = postRepo.findOne(id);
        postService.downVote(post);
        return "redirect:/";
    }

}
