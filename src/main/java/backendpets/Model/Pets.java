package backendpets.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Pet")
public class Pets{

    @Id
    @GeneratedValue

    private @Getter @Setter Long id;

    @NotBlank @NonNull
    private @Getter @Setter String ownerName;
    @NotBlank @NonNull
    private @Getter @Setter String petName;
    @NotBlank @NonNull 
    private @Getter @Setter String typeOfPet;
    @NotBlank @NonNull
    private @Getter @Setter String petGender;
    @NotBlank @NonNull
    private @Getter @Setter String address;
    @NotNull
    @Min(0)
    private @Getter @Setter int petAge;
    @NotBlank @NonNull
    private @Getter @Setter String hasVaccine;
}
