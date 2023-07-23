package com.challenge.authorizationSystem.service;

import com.challenge.authorizationSystem.models.Post;
import com.challenge.authorizationSystem.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public Post savePostDetails(Post post) {
        return postRepository.save(post);
    }
}
