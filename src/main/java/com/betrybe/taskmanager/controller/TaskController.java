package com.betrybe.taskmanager.controller;

/*
 * Task Controller class.
 */

import com.betrybe.taskmanager.dto.TaskCreationDto;
import com.betrybe.taskmanager.dto.TaskDto;
import com.betrybe.taskmanager.model.TaskModel;
import com.betrybe.taskmanager.service.TaskService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Task controller.
 */
@RestController
@RequestMapping("/tasks")
public class TaskController {

  private final TaskService service;

  @Autowired
  public TaskController(TaskService service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<List<TaskDto>> getTasks() {
    List<TaskDto> response = this.service.getTasks();
    return ResponseEntity.ok(response);
  }

  /**
   * Task get by id endpoint.
   */

  @GetMapping("/{id}")
  public ResponseEntity<TaskDto> getTaskById(@PathVariable String id) {
    TaskDto task = this.service.getTaskById(id);
    if (task == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(task);
  }

  @PostMapping
  public ResponseEntity<String> createTask(@RequestBody TaskCreationDto request) {
    TaskModel newTask = this.service.createTask(request);
    return ResponseEntity.status(201).body(newTask.getId());
  }
}
