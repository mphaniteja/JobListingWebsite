package com.example.jobListings.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.jobListings.model.Post;

public interface PostRepository extends MongoRepository<Post, String>{

	List<Post> findAll();

}
