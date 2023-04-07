package com.todoapp.todoapp.Repository;

import com.todoapp.todoapp.Model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends MongoRepository <Task, String> {
}
