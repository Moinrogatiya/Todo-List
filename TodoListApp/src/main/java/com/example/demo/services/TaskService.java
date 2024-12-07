package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Task;
import com.example.demo.repositories.TaskRepository;

@Service
@Transactional
public class TaskService {

	@Autowired
	TaskRepository taskRepo;

	public List<Task> getAllTasks() {
		return taskRepo.findAll();
	}

	public Task addTask(Task t) {
		return taskRepo.save(t);
	}

	public String getCompletedTasks(boolean status) {
		return taskRepo.findByCompleted(status);
	}

	public String getIncompletedTasks(boolean status) {
		return taskRepo.findByIncompleted(status);
	}

	public int UpdateStatus(int id, boolean status) {
		return taskRepo.updateStatus(id,status);
	}

	public void deleteTask(int id) {
		taskRepo.deleteById(id);
	}
	
}
