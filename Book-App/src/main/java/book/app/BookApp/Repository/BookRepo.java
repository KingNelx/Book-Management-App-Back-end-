package book.app.BookApp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
import book.app.BookApp.Model.Book;

public interface BookRepo extends MongoRepository <Book, String> {
    
    List <Book> findByGenre (String genre);
}
