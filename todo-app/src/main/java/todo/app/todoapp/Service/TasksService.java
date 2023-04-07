package todo.app.todoapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import todo.app.todoapp.Model.Tasks;

@Service
public interface TasksService {

    // get all tasks
    List<Tasks> getAllTasks();

    // get task by id
    Optional<Tasks> getTaskByID(String id);

    // add new task
    ResponseEntity<Tasks> addNewTask(Tasks newTasks);

    // update task by id
    ResponseEntity<Tasks> updateTaskByID(String id, Tasks newTasks);

    // delete task by id
    String deleteTaskByID(String id);

}
