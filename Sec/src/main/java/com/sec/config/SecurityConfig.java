package com.sec.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableGlobalMethodSecurity(securedEnabled = true)
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public void configureAuth(AuthenticationManagerBuilder auth) throws Exception{
		//meghatarozzuk az ADMIN es a USER jelszavat/felhasznalonevet
		auth
		  .inMemoryAuthentication()
		    .withUser("sfjuser") 
		    .password("{noop}pass")
		    .roles("USER")
		   .and()
             .withUser("sfjadmin")
             .password("{noop}pass")
             .roles("ADMIN");
	}
	
	
	//meg mondjuk ki mit erhet el
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
		     	.antMatchers("/css/**").permitAll()  // a forumon ajanlottak, megoldaskent arra, hogy ne jöjjön be a blog.css
				.antMatchers("/admin/**").hasRole("ADMIN")
				.anyRequest().authenticated()      //mindenkinek azonositani kell magat
				.and()
			.formLogin()
				.loginPage("/login")               // lecserelem az alaplogint
				.permitAll()						//mindenki elerheti
				.and()
			.logout()
				.logoutSuccessUrl("/login?logout")
				.permitAll();
	}	
	
}
