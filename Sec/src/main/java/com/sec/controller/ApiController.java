package com.sec.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	
	@RequestMapping
	public String index() {
		return "Főoldal";
	}
	
//	@Secured ("ROLE_USER") - a configban beallitjuk, ide mar nem kell
    @RequestMapping("/stories")
    public String stories() {
    	return "Stories";
    }
    
//	@Secured ("ROLE_ADMIN")
    @RequestMapping("/delete")
    public String delete() {
    	return "Delete";
    }    
    
}


