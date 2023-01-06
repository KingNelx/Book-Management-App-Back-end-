package backendpets.Repository;

import backendpets.Model.Pets;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface PetRepository extends JpaRepository <Pets, Long> {
    List<Pets> findAllByTypeOfPet(String typeOfPet);
    List<Pets> findAllByOwnerName(String ownerName);
}
