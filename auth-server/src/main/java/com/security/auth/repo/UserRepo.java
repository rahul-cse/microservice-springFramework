package com.security.auth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.auth.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{

	User findByUsername(String username);

}
