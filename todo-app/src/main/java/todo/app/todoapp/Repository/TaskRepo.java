package todo.app.todoapp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import todo.app.todoapp.Model.Tasks;

@Repository
public interface TaskRepo extends MongoRepository<Tasks, String> {

}
