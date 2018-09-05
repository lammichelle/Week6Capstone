package com.capstone6.Capstone6.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone6.Capstone6.entity.Task;
import com.capstone6.Capstone6.entity.User;

public interface TaskRepository extends JpaRepository<Task, Long>{
	
	List<Task> findAllByOrderByName();

	List<Task> findAllByUser(User user);

}
