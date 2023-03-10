package backendpets.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import backendpets.Model.Pets;

public interface PetsRepo extends JpaRepository<Pets, Long>{
    List<Pets> findAllByTypeOfPet(String typeOfPet);
    List<Pets> findAllByPetGender(String petGender);
    List<Pets> findAllByHasVaccine(String hasVaccine);
}
