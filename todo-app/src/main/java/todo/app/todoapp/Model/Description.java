package todo.app.todoapp.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Document(collection = "Description")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Description {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private @Getter @Setter String id;
    private @Getter @Setter String createdBy;
    private @Getter @Setter String difficulty;
    @ElementCollection
    private @Getter @Setter List<String> tags;

}
