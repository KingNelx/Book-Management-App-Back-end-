package com.todoapp.todoapp.Model;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import java.util.List;
import jakarta.persistence.ElementCollection;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Document(collection = "Description")
public class Description {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Field(name = "descriptionID")
    private @Getter @Setter String descriptionID;
    @ElementCollection
    private @Getter @Setter List <String> descriptions;
    private @Getter @Setter String difficulty;

}
