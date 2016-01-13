package com.example.BlogExample.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.BlogExample.model.Blog;
import com.example.BlogExample.service.EditBlogService;

@Controller
public class BlogEditController {

	@Autowired
	private EditBlogService editService;
	
	@RequestMapping(value = "editBlog", method = RequestMethod.GET)
	public String getBlogList(@RequestParam("id") String id, Model model) {

		System.out.println("editBlog");
		System.out.println("Id = " + id );

		Blog blog = null; 

		if( id.equals("-1") == false ) {
			blog = editService.getBlog(Long.parseLong(id));
		} else {
			blog = new Blog();
		}
		
		model.addAttribute("blog", blog);

		return "editBlog";
	}


	

	@RequestMapping(value = "editBlog", method = RequestMethod.POST)
	public String updateGoal(@Valid @ModelAttribute("blog") Blog blog, BindingResult result) {
		
		System.out.println("result has errors: " + result.hasErrors());
		
		System.out.println("Blog title: " + blog.getTitle());
		System.out.println("Blog description: " + blog.getDescription());
		
		if(result.hasErrors()) {
			return "editBlog";
		} else {
			editService.save(blog);
		}
		
		return "redirect:listBlogs.html";
	}

	
	
}
