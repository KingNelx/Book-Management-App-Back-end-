package com.todoapp.todoapp.Model;

import org.springframework.data.mongodb.core.mapping.DBRef;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Field(name = "taskID")
    private @Getter @Setter String taskID;
    @Column(unique = true)
    private @Getter @Setter String taskName;
    @DBRef
    private @Getter @Setter Description description;
    private @Getter @Setter String dateStarted;
    private @Getter @Setter String expectedDateToFinish;
}
