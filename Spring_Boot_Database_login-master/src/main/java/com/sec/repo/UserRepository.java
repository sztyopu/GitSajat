package com.sec.repo;
import org.springframework.data.repository.CrudRepository;

import com.sec.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByEmail(String email);

}
