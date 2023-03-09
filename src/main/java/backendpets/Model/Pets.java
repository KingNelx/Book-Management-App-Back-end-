package backendpets.Model;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pets_table")
public class Pets {
    
    @Id
    @GeneratedValue
    private @Getter @Setter Long id;
    private @Getter @Setter @NotBlank @NotEmpty String petName;
    private @Getter @Setter @NotBlank @NotEmpty String typeOfPet;
    private @Getter @Setter @NotNull int petAge;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_id", referencedColumnName = "id")
    private @Getter @Setter Pets pet;
}
