package todo.app.todoapp.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import todo.app.todoapp.Model.Description;

@Service
public interface DescriptionService {

    // get all description
    List<Description> getAllDescription();

    // get description by ID
    Optional<Description> getDescriptionByID(String id);

}
