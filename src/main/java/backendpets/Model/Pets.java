package backendpets.Model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pets_table")
@Entity
@NotBlank
@NotEmpty
public class Pets {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String ownerName;
    private String petName;
    private int ownerAge;
    private int petAge;
    private String address;
    private String typeOfPet;
    private String hasVaccine;

}
