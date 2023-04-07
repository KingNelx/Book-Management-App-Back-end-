package com.todoapp.todoapp.Controller;

import com.todoapp.todoapp.Model.Task;
import com.todoapp.todoapp.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/taskAPI")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // get all TASK
    @GetMapping("/getAllTasks")
    public List <Task> queryAllTasks() throws Exception{
        return taskService.getAllTask();
    }

    // add new TASK
    @PostMapping("/addTask")
    public ResponseEntity <Task> newTask(@RequestBody Task newTask) throws Exception{
        return taskService.newTask(newTask);
    }

    // get TaskBy ID
    @GetMapping("/getTaskByID/{taskID}")
    public Optional <Task> getTaskByID(@PathVariable String taskID) throws Exception{
        return taskService.getTaskByID(taskID);
    }

    // delete TaskByID
    @DeleteMapping("/deleteTaskByID/{taskID}")
    public String deleteByID(@PathVariable String taskID) throws Exception{
        return taskService.deleteTaskByID(taskID);
    }

    // update TaskBy ID
    @PutMapping("/updateTaskByID/{taskID}")
    public String updateTask(@RequestBody Task newTask, @PathVariable String taskID) throws Exception{
        taskService.updateTask(newTask, taskID);
        return "SUCCESSFULLY UPDATED";
    }
}
