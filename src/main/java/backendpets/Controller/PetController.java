package backendpets.Controller;

import backendpets.Model.Pets;
import backendpets.Repository.PetsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PetController {
    
    @Autowired
    private PetsRepo petsRepo;

    @GetMapping("/getAllPets")
    List<Pets> getAllPets(){
        return petsRepo.findAll();
    }
}
