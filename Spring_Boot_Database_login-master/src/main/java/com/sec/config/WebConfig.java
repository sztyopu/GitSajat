package com.sec.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer{

	
//	@SuppressWarnings("deprecation")
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	//	super.addViewControllers(registry);
	    WebMvcConfigurer.super.addViewControllers(registry);
        registry.addViewController("/login").setViewName("auth/login");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);		
	}
}
