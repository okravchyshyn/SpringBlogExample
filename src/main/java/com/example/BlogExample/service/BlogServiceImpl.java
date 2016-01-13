package com.example.BlogExample.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.BlogExample.model.Blog;
import com.example.BlogExample.repository.BlogRepository;

@Service("blogService")
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepository blogRepository;

	public List<Blog> findAllBlogs() {
		
		return blogRepository.loadAll();
	}

	public void setBlogRepository(BlogRepository blogRepository) {
		this.blogRepository = blogRepository;
	}

}
