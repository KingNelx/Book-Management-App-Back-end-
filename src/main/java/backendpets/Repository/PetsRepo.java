package backendpets.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import backendpets.Model.Pets;

public interface PetsRepo extends JpaRepository<Pets, Long>{
    List<Pets> findAllByTypeOfPet(String typeOfPet);
    
}
