package todo.app.todoapp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.app.todoapp.Model.Description;
import todo.app.todoapp.Service.DescriptionService;

@RestController
@RequestMapping("/api/desc")
public class DescriptionController {

    @Autowired
    private DescriptionService descriptionService;

    @GetMapping("/getAllDescription")
    public List<Description> getAllDescription() {
        return descriptionService.getAllDescription();
    }

    @GetMapping("/getDescriptionByID/{id}")
    public Optional <Description> getDescriptionByID(@PathVariable String id){
        return descriptionService.getDescriptionByID(id);
    }
    
}
