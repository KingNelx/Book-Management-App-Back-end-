package book.app.BookApp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import book.app.BookApp.Model.Reviews;

public interface ReviewRepo extends MongoRepository <Reviews, String> {
    
}
