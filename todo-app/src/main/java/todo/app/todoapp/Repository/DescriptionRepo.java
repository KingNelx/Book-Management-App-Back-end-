package todo.app.todoapp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import todo.app.todoapp.Model.Description;

public interface DescriptionRepo extends MongoRepository<Description, String> {
}
