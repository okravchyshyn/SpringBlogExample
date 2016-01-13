package testBlogExample;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.example.BlogExample.model.Blog;
import com.example.BlogExample.service.BlogService;

import junit.framework.TestCase;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class BlogListControllerTest extends TestCase {
	
   @Autowired
   private BlogService blogService;

   @Test
   public void testBlogListController() {
	   List<Blog> blogs = blogService.findAllBlogs();
	   assertTrue(blogs.size() == 2);
	   
	   System.out.println("testBlogListController" );
   }

}
 