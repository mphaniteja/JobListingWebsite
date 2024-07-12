package com.example.jobListings.repository;

import java.util.List;

import com.example.jobListings.model.Post;

public interface SearchRepository  {

	List<Post> findByText(String text);

}
