package com.betrybe.taskmanager.controller;

/*
 * Task Controller class.
 */

import com.betrybe.taskmanager.dto.TaskDto;
import com.betrybe.taskmanager.model.TaskModel;
import com.betrybe.taskmanager.service.TaskService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
