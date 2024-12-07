package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.DummyTasks;
import com.example.demo.entities.Task;
import com.example.demo.services.TaskService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class TaskController {

	@Autowired
	TaskService taskService;
	
	@GetMapping("/gettask")
	public List<Task> getAllTasks() {
		return taskService.getAllTasks();
	}
	
	@PostMapping("/addtask")
	public Task addTask(@RequestBody DummyTasks dt) {
		Task t = new Task();
		t.setStatus(dt.isStatus());
		t.setTaskDescription(dt.getTaskDescription());
		t.setTaskName(dt.getTaskName());
		
		return taskService.addTask(t);
	}
	
	@GetMapping("/getcompletedtask")
	public String getCompletedTasks(@RequestParam("status") boolean status) {
		return taskService.getCompletedTasks(status);
	}
	
	@GetMapping("/getincompletedtask")
	public String getIncompletedTasks(@RequestParam("status") boolean status) {
		return taskService.getIncompletedTasks(status);
	}
	
	@PutMapping("updatestatus")
	public int updateTaskStatus(@RequestParam("id") int id, @RequestParam("status") boolean status) {
		return taskService.UpdateStatus(id,status);
	}
	
	@DeleteMapping("/deletetask")
	public void deleteTask(@RequestParam("id") int id) {
		taskService.deleteTask(id);
	}
}
