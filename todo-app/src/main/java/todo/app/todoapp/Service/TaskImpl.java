package todo.app.todoapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import todo.app.todoapp.Model.Description;
import todo.app.todoapp.Model.Tasks;
import todo.app.todoapp.Repository.DescriptionRepo;
import todo.app.todoapp.Repository.TasksRepo;

@Service
public class TaskImpl implements TaskService {

    @Autowired
    private TasksRepo tasksRepo;

    @Autowired
    private DescriptionRepo descriptionRepo;

    @Override
    public ResponseEntity<String> addNewTask(Tasks newTasks) {
        Description description = newTasks.getDescription();
        if (description != null && description.getId() != null) {
            descriptionRepo.save(description);
        }
        tasksRepo.save(newTasks);
        return ResponseEntity.ok("SAVE");
    }

    @Override
    public Optional<Tasks> getTaskByID(String id) {
        if (!tasksRepo.findById(id).isPresent()) {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
        return tasksRepo.findById(id);
    }

    @Override
    public Tasks updateTaskByID(Tasks newTasks, String id) {
        Tasks updateTask = tasksRepo.findById(id).orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND));
        updateTask.setId(newTasks.getId());
        updateTask.setTaskName(newTasks.getTaskName());
        updateTask.setStartDate(newTasks.getStartDate());

        Description description = newTasks.getDescription();
        if (description == null) {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
        Description updatDescription = updateTask.getDescription();
        updatDescription.setCreatedBy(description.getCreatedBy());
        updatDescription.setDifficulty(description.getDifficulty());
        updatDescription.setTags(description.getTags());

        descriptionRepo.save(updatDescription);
        updateTask.setDescription(updatDescription);

        Tasks updated = tasksRepo.save(updateTask);
        return updated;
    }

    @Override
    public ResponseEntity<String> deleteTaskByID(String id) {

        if (!tasksRepo.findById(id).isPresent()) {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
        tasksRepo.deleteById(id);
        return ResponseEntity.ok("DELETED");
    }
}
