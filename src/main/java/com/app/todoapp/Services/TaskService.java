package com.app.todoapp.Services;

import com.app.todoapp.models.Task;
import com.app.todoapp.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository, TaskRepository taskRepository1){

        this.taskRepository = taskRepository1;
    }
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

}
