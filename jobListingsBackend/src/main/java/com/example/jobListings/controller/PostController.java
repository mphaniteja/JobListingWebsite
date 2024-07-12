package com.example.jobListings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jobListings.model.Post;
import com.example.jobListings.repository.PostRepository;
import com.example.jobListings.repository.SearchRepository;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {
	
	@Autowired
	private PostRepository repo;
	
	@Autowired
	private SearchRepository searhRepo;
	
	 @GetMapping("/allPosts")
	    @CrossOrigin
	    public List<Post> getAllPosts()
	    {
	        return repo.findAll();
	    }
	    @GetMapping("/posts/{text}")
	    @CrossOrigin
	    public List<Post> search(@PathVariable String text)
	    {
	        return searhRepo.findByText(text);
	    }

	    @PostMapping("/post")
	    @CrossOrigin
	    public Post addPost(@RequestBody Post post)
	    {
	        return repo.save(post);
	    }

	

}
