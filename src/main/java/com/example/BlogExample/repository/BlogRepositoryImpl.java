package com.example.BlogExample.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.BlogExample.model.Blog;


@Repository("blogRepository")
public class BlogRepositoryImpl implements BlogRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Blog> loadAll() {
		Query query = em.createQuery("Select b from Blog b");
		@SuppressWarnings("rawtypes")
		List blogs = query.getResultList();

		return blogs;
	}

	public Blog save(Blog blog) {

		if( blog.getId() == null ) {
			em.persist(blog);
			em.flush();
		} else {
			blog = em.merge(blog);
		}

		return blog;
	}

	@SuppressWarnings("unchecked")
	public List<Blog> getBlogById(Long id) {
		Query query = em.createQuery("Select b from Blog b where b.id = " + id);
		@SuppressWarnings("rawtypes")
		List blogs = query.getResultList();

		return blogs;
	}

}
