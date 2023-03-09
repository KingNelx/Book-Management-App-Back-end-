package backendpets.Model;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "owners_table")
@Entity
public class Owners {
    
    @Id
    @GeneratedValue

    private @Getter @Setter Long id;
    private @Getter @Setter @NotBlank @NotEmpty String firstName;
    private @Getter @Setter @NotBlank @NotEmpty String lastName;
    private @Getter @Setter @Email String emailAddress;
    private @Getter @Setter @NotBlank @NotEmpty String phoneNumber;
    private @Getter @Setter @NotNull int age;

    
    
}
