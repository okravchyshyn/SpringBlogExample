package com.example.BlogExample.service;

import com.example.BlogExample.model.Blog;

public interface EditBlogService {
	public Blog getBlog(Long id);

	public void save(Blog blog);
}
