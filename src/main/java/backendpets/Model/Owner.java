package backendpets.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="owners")
@AllArgsConstructor
@NoArgsConstructor
public class Owner {
    
    @Id
    @GeneratedValue
    private @Getter @Setter Long id;
    private @Getter @Setter @NotEmpty @NotBlank String firstName;
    private @Getter @Setter @NotEmpty @NotBlank String lastName;
    private @Getter @Setter @NotEmpty @NotBlank String completeAddress;
    @Email(message = "Please enter a valid email address")
    private @Getter @Setter @NotEmpty @NotBlank String emailAddress;
    private @Getter @Setter @NotEmpty @NotBlank String contactNumber;
    
}
