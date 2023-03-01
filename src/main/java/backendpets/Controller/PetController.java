package backendpets.Controller;

import backendpets.Exception.PetNotFound;
import backendpets.Model.Pets;
import backendpets.Repository.PetRepository;
import java.util.List;


import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin(
  origins = "http://localhost:5173",
  methods = { RequestMethod.GET, RequestMethod.POST },
  allowedHeaders = "*"
)
public class PetController {

  @Autowired
  private PetRepository petRepository;

  @PostMapping("/registerPet")
  Pets registerPet(@RequestBody @Valid Pets registerPet) {
    return petRepository.save(registerPet);
  }

  @GetMapping("/queryAllPets")
  List<Pets> queryAllPets() {
    return petRepository.findAll();
  }

  @GetMapping("/withVaccine")
  List<Pets> withVaccine() {
    return petRepository.findAllByHasVaccine("YES");
  }

  @GetMapping("/withNoVaccine")
  List<Pets> withNoVaccine() {
    return petRepository.findAllByHasVaccine("NO");
  }

  @GetMapping("/queryAllOwners")
  List<Pets> queryAllOwners() {
    return petRepository.findAll();
  }

  @GetMapping("/queryAllDogs")
  List<Pets> queryAllDogs() {
    return petRepository.findAllByTypeOfPet("DOG");
  }

  @GetMapping("/queryAllCats")
  List<Pets> queryAllCats() {
    return petRepository.findAllByTypeOfPet("CAT");
  }

  @GetMapping("/queryAllRabbits")
  List<Pets> queryAllRabbits() {
    return petRepository.findAllByTypeOfPet("RABBIT");
  }

  @GetMapping("/queryAllTurtles")
  List<Pets> queryAllTurtles() {
    return petRepository.findAllByTypeOfPet("TURTLE");
  }

  @GetMapping("/queryAllSnakes")
  List<Pets> queryAllSnakes() {
    return petRepository.findAllByTypeOfPet("SNAKE");
  }

  @GetMapping("/queryAllBirds")
  List<Pets> queryAllBirds() {
    return petRepository.findAllByTypeOfPet("BIRD");
  }

  @GetMapping("/queryAllMalePets")
  List<Pets> queryAllMalePets() {
    return petRepository.findAllByPetGender("MALE");
  }

  @GetMapping("/queryAllFemalePets")
  List<Pets> queryAllFemalePets() {
    return petRepository.findAllByPetGender("FEMALE");
  }

  @GetMapping("/pet/{id}")
  Pets getPetsByID(@PathVariable Long id) {
    return petRepository.findById(id)
    .orElseThrow( () -> new PetNotFound(id));
  }

  @PutMapping("/pet/{id}")
  Pets updatePets(@RequestBody Pets newData, @PathVariable Long id) {
   return petRepository.findById(id)
   .map(pet -> {
      pet.setPetGender(newData.getPetGender());
      return pet;
   }).orElse(null);
}

  }

