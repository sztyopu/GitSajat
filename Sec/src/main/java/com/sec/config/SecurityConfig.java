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
	protected void configure(HttpSecurity httpSec) throws Exception {
	   httpSec
		  .authorizeRequests()
			   .antMatchers("/admin/**").hasRole("ADMIN")   //admin/barmi -t is elerhet csak az admin 
			   .anyRequest().authenticated()				// mindenkinek azonositani kell magat
			   .and()
				.formLogin()
					.loginPage("/login")					// a login ezen a path-en ered el
					.permitAll()							// mindenki elerheti
					.and()
				.logout()									// kijelenkezes
					.logoutSuccessUrl("/login?logout")		//itt ered el
					.permitAll();							//mindenki
	}
	
	
}
