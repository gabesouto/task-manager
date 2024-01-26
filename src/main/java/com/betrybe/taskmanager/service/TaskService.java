package com.betrybe.taskmanager.service;

/*
 * Task Service class.
 */

import com.betrybe.taskmanager.database.FakeTaskDatabase;
<<<<<<< HEAD
import com.betrybe.taskmanager.dto.TaskCreationDto;
=======
>>>>>>> b9a0fbd4dc6feddc6b9fc003e0a6e0a304617761
import com.betrybe.taskmanager.dto.TaskDto;
import com.betrybe.taskmanager.model.TaskModel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Task service class.
 */

@Service
public class TaskService {

  private final FakeTaskDatabase repository;

  @Autowired
  public TaskService(FakeTaskDatabase repository) {
    this.repository = repository;
  }

  /**
   * Task get tasks method.
   */

  public List<TaskDto> getTasks() {
    List<TaskModel> tasks = this.repository.getAllTasks();
    List<TaskDto> taskDtos = new ArrayList<>();
    for (TaskModel task : tasks) {
      TaskDto taskDto = new TaskDto(
          task.getId(),
          task.getTitle(),
          task.getDescription(),
          task.getOwnerName(),
          task.getIsCompleted()
      );
      taskDtos.add(taskDto);
    }
    return taskDtos;
  }
<<<<<<< HEAD

  /**
   * Task get by id method.
   */

  public TaskDto getTaskById(String id) {
    TaskModel task = this.repository.getTaskById(id);
    if (task == null) {
      return null;
    }

    return new TaskDto(
        task.getId(),
        task.getTitle(),
        task.getDescription(),
        task.getOwnerName(),
        task.getIsCompleted());
  }

  public TaskModel createTask(TaskCreationDto request) {

    return this.repository.createTask(request.title(), request.description(), request.ownerName());
  }

}
