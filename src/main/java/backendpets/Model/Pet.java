package backendpets.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;


@Entity
@Table(name = "pets")
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    
    @Id
    @GeneratedValue
    private @Getter @Setter Long id;
    private @Getter @Setter @NotEmpty @NotBlank String petName;
    private @Getter @Setter @NotEmpty @NotBlank String typeOfPet;
    private @Getter @Setter @NotNull int petAge;
    private @Getter @Setter @NotEmpty @NotBlank String hasVaccine;

    @OneToOne
    // foreign key
    @JoinColumn(name = "owner_id")
    private Owner owner;
}
