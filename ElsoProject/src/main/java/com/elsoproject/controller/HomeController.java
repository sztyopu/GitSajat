package com.elsoproject.controller;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elsoproject.domain.Story;

@Controller								
public class HomeController {

	
	
	@RequestMapping("/")
	public String stories(Model model) {
		model.addAttribute("pageTitle","Minden napra egy SFJ sztori!");
		model.addAttribute("stories", getStories());
		return "stories";
	}
	
	
	private ArrayList<Story> getStories(){
		ArrayList<Story> stories = new ArrayList<Story>();
		
		Story story1 = new Story();
		story1.setTitle("Első story");
		story1.setPosted(new Date());
		story1.setAuthor("Sztyopu");
		story1.setContent("Hajrá Palád!");
		
		
		Story story2 = new Story(); 
		story2.setTitle("Második story");
		story2.setPosted(new Date());
		story2.setAuthor("Krisz");
		story2.setContent("Hajrá Palád, lobogjon a zászló!");
		
		
		
		stories.add(story1);
		stories.add(story2);
		
		return stories;
	}
}
