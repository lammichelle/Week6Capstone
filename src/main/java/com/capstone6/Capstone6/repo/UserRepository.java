package com.capstone6.Capstone6.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone6.Capstone6.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	List<User> findAllByOrderByName();

	User findByEmail(String email);
}
