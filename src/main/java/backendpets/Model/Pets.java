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
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pets_table")
@Entity
public class Pets {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @NotBlank
    @NotEmpty
    private String ownerName;

    @NotBlank
    @NotEmpty
    private String petName;

    @NotNull
    private int ownerAge;

    @NotNull
    private int petAge;

    @NotBlank
    @NotEmpty
    private String address;

    @NotBlank
    @NotEmpty
    private String petGender;
    @NotBlank
    @NotEmpty
    private String typeOfPet;

    @NotBlank
    @NotEmpty
    private String hasVaccine;

}
