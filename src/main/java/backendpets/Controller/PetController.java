package backendpets.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import backendpets.Model.Pets;
import backendpets.Repository.PetRepository;
import java.util.List;

@RestController
@RequestMapping
public class PetController{

    @Autowired
    private PetRepository petRepository;

    @PostMapping("/registerPet")
    Pets registerPet(@RequestBody @Valid  Pets registerPet) {
       return petRepository.save(registerPet);
    }

    @GetMapping("/queryAllPets")
    List<Pets> queryAllPets(){
        return petRepository.findAll();
    }

    @GetMapping("/queryAllDogs")
    List<Pets> queryAllDogs(){
        return petRepository.findAllByTypeOfPet("dog");
    }

    @GetMapping("/queryAllCats")
    List<Pets> queryAllCats(){
        return petRepository.findAllByTypeOfPet("cat");
    }

    @GetMapping("/queryAllRabbits")
    List<Pets> queryAllRabbits(){
        return petRepository.findAllByTypeOfPet("rabbit");
    }
    
    @GetMapping("/queryAllTurtles")
    List<Pets> queryAllTurtles(){
        return petRepository.findAllByTypeOfPet("turtle");
    }

    @GetMapping("/queryAllSnakes")
    List<Pets> queryAllSnakes(){
        return petRepository.findAllByTypeOfPet("snakes");
    }

    @GetMapping("/queryAllBirds")
    List<Pets> queryAllBirds(){
        return petRepository.findAllByTypeOfPet("birds");
    }

    @GetMapping("/queryAllPetsVaccinated")
    List<Pets> queryAllPetsVaccinated(){
        return petRepository.findAllByHasVaccine("yes");
    }

}