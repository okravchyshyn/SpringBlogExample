package testBlogExample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.BlogExample.repository.BlogRepository;
import com.example.BlogExample.service.BlogService;
import com.example.BlogExample.service.BlogServiceImpl;



@Configuration
public class AppConfig {
	
    @Bean(name="blogService")
    public BlogService getBlogService() {
    	System.out.println("getBlogListController");
    	BlogService serv = new BlogServiceImpl();
    	return serv;
    }

    @Bean(name="blogRepository")
    public BlogRepository getBlogRepository() {
    	System.out.println("getBlogRepository");
    	BlogRepository blogRepository = new BlogRepositoryMock();
    	return blogRepository;
    }

}


