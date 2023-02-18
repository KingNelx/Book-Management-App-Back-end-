package backendpets.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import backendpets.Model.Pets;

public interface PetsRepo extends JpaRepository <Pets, Long>{
    
}
