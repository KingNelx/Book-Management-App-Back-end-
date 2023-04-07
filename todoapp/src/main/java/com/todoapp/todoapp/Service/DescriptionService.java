package com.todoapp.todoapp.Service;

import com.todoapp.todoapp.Model.Description;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DescriptionService {

    // get all Description
    List <Description> getAllDescription();

    // getDescriptionBy ID
    Optional <Description> getDescriptionByID(String descriptionID);

    // update description by ID
    ResponseEntity <Description> updateDescription(String taskID, String descriptionID, Description updatedDescription);
    // put (api/taskID/descriptID/

}
