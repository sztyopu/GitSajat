package com.elsoproject.domain;
import java.util.Date;

public class Story {


	private Long id;
	private String title;
	private String content;

	private Date posted;
	
	private Blogger blogger;

	public Story() {}
	
	public Story(Long id, String title, String content, Date posted, Long bloggerId) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.posted = posted;
		this.blogger = new Blogger(bloggerId, "Krisz", 21);
	}
	
	public Story(String title, String content, Date posted, Blogger blogger) {
		this.title = title;
		this.content = content;
		this.posted = posted;
		this.blogger = blogger;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPosted() {
		return posted;
	}

	public void setPosted(Date posted) {
		this.posted = posted;
	}

	public Blogger getBlogger() {
		return blogger;
	}

	public void setBlogger(Blogger blogger) {
		this.blogger = blogger;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Story [title=" + title + "]";
	}

	
}
