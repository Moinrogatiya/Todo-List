package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {

	@Query("SELECT t FROM Task t WHERE t.completed = true")
	String findByCompleted(boolean status);

	@Query("SELECT t FROM Task t WHERE t.completed = false")
	String findByIncompleted(boolean status);

	@Modifying
	@Query("update Task t set t.status = :status where t.pid =:id")
	int updateStatus(int id, boolean status);

}
