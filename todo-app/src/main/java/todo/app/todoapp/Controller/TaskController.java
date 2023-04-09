package todo.app.todoapp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.app.todoapp.Model.Tasks;
import todo.app.todoapp.Service.TaskService;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/addTasks")
    public ResponseEntity<String> addNewTask(@RequestBody Tasks newTasks) {
        return taskService.addNewTask(newTasks);
    }

    

    @GetMapping("/taskByID/{id}")
    public Optional<Tasks> getTaskByID(@PathVariable String id) {
        return taskService.getTaskByID(id);
    }

    @PutMapping("updateTaskByID/{id}")
    public Tasks updateTaskByID(@RequestBody Tasks update, @PathVariable("id") String id) {
        return taskService.updateTaskByID(update, id);
    }

    @DeleteMapping("/deleteByID/{id}")
    public ResponseEntity<String> deleteTaskByID(@PathVariable String id) {
        return taskService.deleteTaskByID(id);
    }

}
