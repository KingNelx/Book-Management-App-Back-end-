package todo.app.todoapp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import todo.app.todoapp.Model.Tasks;

public interface TasksRepo extends MongoRepository<Tasks, String> {

}