package backendpets.Repository;

import backendpets.Model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PetRepo extends JpaRepository <Pet, Long> {
    List getAllPetsByTypeOfPet(String typeOfPet);
}
