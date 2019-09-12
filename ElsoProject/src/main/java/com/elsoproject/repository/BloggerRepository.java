package com.elsoproject.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elsoproject.domain.Blogger;

@Repository
public interface BloggerRepository extends CrudRepository<Blogger, Long> {

	List<Blogger> findAll(); 
}
