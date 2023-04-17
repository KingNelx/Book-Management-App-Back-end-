package book.app.BookApp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import book.app.BookApp.Model.Book;

public interface BookRepo extends MongoRepository <Book, String> {
    
}
