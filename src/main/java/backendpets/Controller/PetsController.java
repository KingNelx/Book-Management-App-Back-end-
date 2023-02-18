package backendpets.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import backendpets.Model.Pets;
import backendpets.Repository.PetsRepo;

@RequestMapping
@RestController
public class PetsController {
    
    @Autowired
    private PetsRepo petsRepo;

    @PostMapping("/addPet")
    Pets addNewPet(@RequestBody Pets pet){
        return petsRepo.save(pet);
    }


    @GetMapping("/getPet")
    List<Pets> getPets(){
        return petsRepo.findAll();
    }
}
