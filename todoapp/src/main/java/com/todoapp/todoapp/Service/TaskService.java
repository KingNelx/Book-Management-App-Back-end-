package com.todoapp.todoapp.Service;

import com.todoapp.todoapp.Model.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TaskService {

    // get all Task
    List <Task> getAllTask() throws Exception;

    // add new Task
    ResponseEntity <Task> newTask(Task newTask) throws Exception;

    // get TaskBy ID
    Optional <Task> getTaskByID(String taskID) throws Exception;

    // delete TaskBy ID
    String deleteTaskByID(String taskID) throws Exception;

    // update TaskBy ID
    Task updateTask (Task newTask, String taskID);

}
