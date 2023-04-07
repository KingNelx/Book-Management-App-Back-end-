package todo.app.todoapp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import todo.app.todoapp.Model.Description;

@Repository
public interface DescriptionRepo extends MongoRepository<Description, String> {

}
