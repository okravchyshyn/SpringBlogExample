package com.example.BlogExample.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.BlogExample.model.Blog;
import com.example.BlogExample.repository.BlogRepository;

@Service("editBlogService")
public class EditBlogServiceImpl implements EditBlogService {

	public EditBlogServiceImpl() {
		System.out.println("ctr EditBlogServiceImpl");
	}
	
	@Autowired
	private BlogRepository blogRepository;
	
	public Blog getBlog(Long id) {
		List<Blog> blogs = blogRepository.getBlogById(id);
		if(blogs.size() > 0 )
			return blogs.get(0);
		else
			return null;
	}

	@Transactional
	public void save(Blog blog) {
		if( blog.getId() == -1 ) {
			blog.setId(null);
			blog.setDate(new Date());
		}
		blogRepository.save(blog);
		
	}

}
