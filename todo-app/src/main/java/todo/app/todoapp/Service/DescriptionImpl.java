package todo.app.todoapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import todo.app.todoapp.Model.Description;
import todo.app.todoapp.Repository.DescriptionRepo;

@Service
public class DescriptionImpl implements DescriptionService {

    @Autowired
    private DescriptionRepo descriptionRepo;

    // get all description
    @Override
    public List<Description> getAllDescription() {
        return descriptionRepo.findAll();
    }

    // get description by ID
    @Override
    public Optional<Description> getDescriptionByID(String id) {
        return descriptionRepo.findById(id);
    }
}
