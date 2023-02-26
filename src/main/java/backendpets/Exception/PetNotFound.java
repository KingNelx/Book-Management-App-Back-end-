package backendpets.Exception;

public class PetNotFound extends RuntimeException{

    public PetNotFound(Long id){
        super(" Pet not found with the id of: " + id);
    }
    
}
