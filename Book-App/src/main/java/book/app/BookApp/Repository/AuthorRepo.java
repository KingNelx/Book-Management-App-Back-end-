package book.app.BookApp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import book.app.BookApp.Model.Author;

public interface AuthorRepo extends MongoRepository <Author, String>{
    
}
