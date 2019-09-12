package com.elsoproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.elsoproject.domain.Story;

@Repository   
public interface StoryRepository extends CrudRepository<Story, Long> {

	//SELECT * FROM STORY
	List<Story> findAll();
	
	
	
	//SELECT * FROM STORY WHERE posted IN (SELECT max(posted) FROM story) LIMIT 1;
	Story findFirstByOrderByPostedDesc();

	
    //(Sima SQL - nem kell a @Param):
	//@Query(value="SELECT * FROM Story WHERE title = ?1 limit 1", nativeQuery = true)
	//Story findByTitle String title);	
	
	//(Sima SQL - kell a @ Param)
	//@Query(value="SELECT * FROM Story WHERE title = :title limit 1", nativeQuery = true)
	//Story findByTitle(@Param ("title")String title);	
	
	//(JPQL (objektumokban gondolkodik) - kell a Param)
	@Query(value = "SELECT s From Story s WHERE s.title = :title ")
	Story findByTitle(@Param ("title")String title);



	List<Story> findAllByBloggerNameIgnoreCaseOrderByPostedDesc(String name);
}
