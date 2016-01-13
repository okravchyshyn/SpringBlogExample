package com.example.BlogExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.BlogExample.model.Blog;
import com.example.BlogExample.service.BlogService;


@Controller
public class BlogListController {
	
	@Autowired
	private BlogService service;
	
	@RequestMapping(value = "listBlogs", method = RequestMethod.GET)
	public String getBlogList(Model model) {
		List<Blog> blogs = service.findAllBlogs();
		
		model.addAttribute("blogs", blogs);
		
		return "listBlogs";
	}
	
}
