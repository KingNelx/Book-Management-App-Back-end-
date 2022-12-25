package backendpets.Controller;


import backendpets.Model.Pet;
import backendpets.Repository.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@RestController
@RequestMapping
@CrossOrigin
public class PetController {

    @Autowired
    private PetRepo petRepo;

    @GetMapping("/getAllPets")
    List<Pet> getAllPets(){
        return petRepo.findAll();
    }

    @PostMapping("/addPet")
    Pet addPet(@RequestBody Pet addPet) {
        return petRepo.save(addPet);
    }

    @GetMapping("/getAllDogs")
    List<Pet> getAllDogs() {
        return petRepo.getAllPetsByTypeOfPet("Dog");
    }

    @GetMapping("/getAllCats")
    List<Pet> getAllCats(){
        return petRepo.getAllPetsByTypeOfPet("Cat");
    }

    @GetMapping("/getAllBirds")
    List<Pet> getAllBirds(){
        return petRepo.getAllPetsByTypeOfPet("Bird");
    }
}
