package com.todoapp.todoapp.Repository;

import com.todoapp.todoapp.Model.Description;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DescriptionRepo extends MongoRepository <Description, String> {
}
