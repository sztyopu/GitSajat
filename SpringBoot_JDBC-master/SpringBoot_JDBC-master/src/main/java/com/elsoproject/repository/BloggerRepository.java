package com.elsoproject.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.elsoproject.domain.Blogger;

@Repository
public class BloggerRepository {

  private JdbcTemplate jdbc;
	
  @Autowired
  public BloggerRepository(JdbcTemplate jdbc){
	 this.jdbc = jdbc;
  }
  
  
		
	
}
