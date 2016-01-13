package com.example.BlogExample.repository;

import java.util.List;

import com.example.BlogExample.model.Blog;

public interface BlogRepository {

	List<Blog> loadAll();
	Blog save(Blog blog);
	List<Blog> getBlogById(Long id);
}
