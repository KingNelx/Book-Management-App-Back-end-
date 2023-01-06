package backendpets.Controller;

import backendpets.Model.Pets;
import backendpets.Repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@RestController
@RequestMapping("/pets")
@CrossOrigin("http://localhost:5173/")
public class PetController {

    @Autowired
    private PetRepository petRepository;

    @PostMapping("/addPet")
    Pets addPet(@RequestBody Pets addPet){
        return petRepository.save(addPet);
    }

    @GetMapping("/getAllPets")
    List<Pets> getAllPets(){
        return petRepository.findAll();
    }

    @GetMapping("/getAllDogs")
    List<Pets> getAllDogs(){
        return petRepository.findAllByTypeOfPet("Dog");
    }

    @GetMapping("/getAllCats")
    List<Pets> getAllCats(){
        return petRepository.findAllByTypeOfPet("Cat");
    }

    @GetMapping("/getAllBirds")
    List<Pets> getAllBirds(){
        return petRepository.findAllByTypeOfPet("Bird");
    }

    @GetMapping("/getAllSnakes")
    List<Pets> getAllSnakes(){
        return petRepository.findAllByTypeOfPet("Snake");
    }

    @GetMapping("/getAllRabbits")
    List<Pets> getAllRabbits(){
        return petRepository.findAllByTypeOfPet("Rabbit");
    }
}
