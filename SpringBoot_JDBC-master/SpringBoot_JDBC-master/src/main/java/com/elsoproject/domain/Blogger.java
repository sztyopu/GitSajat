package com.elsoproject.domain;

import java.util.ArrayList;
import java.util.List;

public class Blogger {
	
	private Long id;
	private String name;
	private int age;
	
	private List<Story> stories;
	
	private Blogger(){
		
	}
	
	public Blogger(Long id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Blogger(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public List<Story> getStories() {
		return stories;
	}

	public void setStories(List<Story> stories) {
		this.stories = stories;
	}

	@Override
	public String toString() {
		return "Blogger [name=" + name + "]";
	}
	

}
