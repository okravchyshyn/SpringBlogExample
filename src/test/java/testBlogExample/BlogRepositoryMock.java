package testBlogExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.example.BlogExample.model.Blog;
import com.example.BlogExample.repository.BlogRepository;

public class BlogRepositoryMock implements BlogRepository {

	private List<Blog> blogs;
	BlogRepositoryMock() {
		this.blogs = new ArrayList<Blog>();
		blogs.add(new Blog(1L, "Title1", "Description 1", new Date()));
		blogs.add(new Blog(2L, "Title2", "Description 2", new Date()));
	}
	
	public List<Blog> loadAll() {
		return blogs;
	}

	public Blog save(Blog blog) {
		// TODO Auto-generated method stub
		return blog;
	}

	public List<Blog> getBlogById(Long id) {
		// TODO Auto-generated method stub
		//List<Blog> filteredBlogs = blogs.stream().filter(p -> p.getId() == id ).collect(Collectors.toList());
		return blogs;	
	}

}
