package com.example.BlogExample.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="blogs")
public class Blog {
	
	@Id
	@GeneratedValue
	@Column(name="GOAL_ID")
	private Long id;

	private String title;
	
	private String description;
	
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private Date   date;
	
	public Blog() {
		
	}
	
	public Blog( Long id, String title, String description, Date date ) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.date = date;
		
	}
	
	public Date getDate() {
		return date;
	}
	public String getDescription() {
		return description;
	}
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
