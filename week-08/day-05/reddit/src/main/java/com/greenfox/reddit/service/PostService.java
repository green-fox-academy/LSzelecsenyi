package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    @Autowired
    EntityManager entityManager;

//    public Page<Post> returnPosts(PageRequest pageRequest) {
//        Page<Post> page = null;
//        try {
//            String queryStr = "Your Query";
//            Query query = entityManager.createNativeQuery(queryStr, Post.class);
//            query.setFirstResult((pageRequest.getPageNumber()) * pageRequest.getPageSize());
//            query.setMaxResults(5);
//            List<Post> posts= query.getResultList();
//            page = new PageImpl<>(posts, pageRequest, 0);
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//        return page;
//    }

    public void downVote(Post post) {
        post.setScore(post.getScore() - 1);
        postRepo.save(post);
    }

    public void upVote(Post post) {
        post.setScore(post.getScore() + 1);
        postRepo.save(post);
    }

}
