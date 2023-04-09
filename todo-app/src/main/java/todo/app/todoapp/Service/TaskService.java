package todo.app.todoapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import todo.app.todoapp.Model.Tasks;

@Service
public interface TaskService {

   

    // add new task db ref with description
    ResponseEntity<String> addNewTask(Tasks tasks);

    // get by id
    Optional<Tasks> getTaskByID(String id);

    // // update by id
    Tasks updateTaskByID(Tasks updateTasks, String id);

    // // delete by id
    ResponseEntity<String> deleteTaskByID(String id);
}
