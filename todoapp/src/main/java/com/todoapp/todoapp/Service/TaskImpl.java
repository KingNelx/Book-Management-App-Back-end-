package com.todoapp.todoapp.Service;

import com.todoapp.todoapp.Model.Task;
import com.todoapp.todoapp.Repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TaskImpl implements  TaskService{

    @Autowired
    private TaskRepo taskRepo;

    // get all TASK
    @Override
    public List <Task> getAllTask() throws Exception{
        return taskRepo.findAll();
    }

    // add new Task
    @Override
    public ResponseEntity <Task> newTask(Task newTask){
       Task saveTask = taskRepo.save(newTask);
       return ResponseEntity.ok(saveTask);
    }

    // get TaskBy ID
    @Override
    public Optional <Task> getTaskByID(String taskID){
        if(taskRepo.findById(taskID).isEmpty()){
            throw new IllegalArgumentException("Task not " +
                    "found with ID: " + taskID);
        }
        return taskRepo.findById(taskID);
    }

    // delete TaskByID
    @Override
    public String deleteTaskByID(String taskID){
       taskRepo.deleteById(taskID);
       return "TASK DELETED";
    }

    @Override
    public Task updateTask(Task newTask, String taskID){
        return taskRepo.findById(taskID).map(cTask -> {
            cTask.setTaskName(newTask.getTaskName());
            cTask.setDateStarted(newTask.getDateStarted());
            cTask.setExpectedDateToFinish(newTask.getExpectedDateToFinish());
            return taskRepo.save(cTask);
        })
                .orElse(null);
    }
}
