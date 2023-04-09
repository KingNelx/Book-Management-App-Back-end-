package todo.app.todoapp.Model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Description")
public class Description {  

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private @Getter @Setter String id;
    private @Getter @Setter String createdBy;
    private @Getter @Setter String difficulty;
    private @Getter @Setter List<String> tags;
}
