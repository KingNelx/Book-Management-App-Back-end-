package todo.app.todoapp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.app.todoapp.Model.Tasks;
import todo.app.todoapp.Service.TasksService;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TasksService tasksService;

    @GetMapping("/getAllTasks")
    List<Tasks> queryAllTasks() {
        return tasksService.getAllTasks();
    }

    @GetMapping("/taskByID/{id}")
    Optional<Tasks> queryTaskByID(@PathVariable String id) {
        return tasksService.getTaskByID(id);
    }

    @PostMapping("/createTask")
    ResponseEntity<Tasks> addNewTask(@RequestBody Tasks newTasks) {
        return tasksService.addNewTask(newTasks);
    }

    @PutMapping("/updateTaskByID/{id}")
    ResponseEntity<Tasks> updateTaskByID(@PathVariable String id, @RequestBody Tasks newTasks) {
        return tasksService.updateTaskByID(id, newTasks);
    }

}