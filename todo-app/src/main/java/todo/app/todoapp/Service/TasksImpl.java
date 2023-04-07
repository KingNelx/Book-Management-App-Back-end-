package todo.app.todoapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import todo.app.todoapp.Model.Tasks;
import todo.app.todoapp.Repository.TaskRepo;

@Service
public class TasksImpl implements TasksService {

    @Autowired
    private TaskRepo taskRepo;

    // get all tasks
    @Override
    public List<Tasks> getAllTasks() {
        return taskRepo.findAll();
    }

    // get task by id
    @Override
    public Optional<Tasks> getTaskByID(String id) {
        return taskRepo.findById(id);
    }

    // add new task
    @Override
    public ResponseEntity<Tasks> addNewTask(Tasks newTask) {
        Tasks addNew = taskRepo.save(newTask);
        return ResponseEntity.ok(addNew);
    }

    // update task by id
    @Override
    public ResponseEntity<Tasks> updateTaskByID(String id, Tasks editTask) {
        Tasks updateTasks = taskRepo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException());

        updateTasks.setTaskName(editTask.getTaskName());
        updateTasks.setStartDate(editTask.getStartDate());

        return ResponseEntity.ok(updateTasks);
    }

    // delete task by id
    @Override
    public String deleteTaskByID(String id) {
        taskRepo.deleteById(id);
        return "DELETED";
    }
}
