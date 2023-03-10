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
@CrossOrigin(origins = "http://localhost:5173/", allowCredentials = "true")
public class PetController {

    @Autowired
    private PetsRepo petsRepo;

    @GetMapping("/getAllPets")
    List<Pets> getAllPets(){
        return petsRepo.findAll();
    }

    @PostMapping("/addPet")
    Pets addPet(@RequestBody Pets addPet){
        return petsRepo.save(addPet);
    }

    @GetMapping("/male")
    List<Pets> getAllMales(){
        return petsRepo.findAllByPetGender("MALE");
    }

    @GetMapping("/female")
    List<Pets> getAllFemales(){
        return petsRepo.findAllByPetGender("FEMALE");
    }

    @GetMapping("/dog")
    List<Pets> findAllDogs(){
        return petsRepo.findAllByTypeOfPet("DOG");
    }

    @GetMapping("/cat")
    List<Pets> findAllCats(){
        return petsRepo.findAllByTypeOfPet("CAT");
    }

    @GetMapping("/rabbit")
    List<Pets> findAllRabbits(){
        return petsRepo.findAllByTypeOfPet("RABBIT");
    }

    @GetMapping("/bird")
    List<Pets> findAllBirds(){
        return petsRepo.findAllByTypeOfPet("BIRD");
    }

    @GetMapping("/turtle")
    List<Pets> findAllTurtles(){
        return petsRepo.findAllByTypeOfPet("TURTLE");
    }

    @GetMapping("/mouse")
    List<Pets> findAllMouse(){
        return petsRepo.findAllByTypeOfPet("MOUSE");
    }
}
