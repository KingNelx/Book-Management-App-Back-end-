package backendpets.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import backendpets.Model.Pets;
import java.util.List;
public interface PetRepository extends JpaRepository<Pets, Long>{
    
    List<Pets> findAllByTypeOfPet(String typeofpet);
}
