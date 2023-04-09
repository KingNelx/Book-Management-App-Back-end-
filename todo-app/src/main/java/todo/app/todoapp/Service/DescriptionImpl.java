package todo.app.todoapp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import todo.app.todoapp.Model.Description;
import todo.app.todoapp.Repository.DescriptionRepo;

@Service
public class DescriptionImpl implements DescriptionService {

    @Autowired
    private DescriptionRepo descriptionRepo;

    @Override
    public List<Description> getAllDescription() {
        if (descriptionRepo.findAll().isEmpty()) {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
        return descriptionRepo.findAll();
    }

    @Override
    public Optional <Description> getDescriptionByID(String id) {
        if(!descriptionRepo.findById(id).isPresent()){
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
            return descriptionRepo.findById(id);
    }
}
