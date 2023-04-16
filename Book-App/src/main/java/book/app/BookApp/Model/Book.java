package book.app.BookApp.Model;

import org.springframework.data.mongodb.core.mapping.DBRef;


import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Book {
    

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    
    private @Getter @Setter String id;

    @DBRef
    private Author author;

    @DBRef
    private Reviews reviews;
}
