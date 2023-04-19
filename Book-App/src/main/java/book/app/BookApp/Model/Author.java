package book.app.BookApp.Model;

import java.util.List;

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

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Document(collection = "Author")
public class Author {

    @Id
    private @Getter @Setter String id;
    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    private @Getter @Setter int age;
    @ElementCollection
    private @Getter @Setter List<String> achievements;
    @ElementCollection
    private @Getter @Setter List<String> awards;
    @ElementCollection
    private @Getter @Setter List<String> honors;
}
