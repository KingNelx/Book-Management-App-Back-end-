package backendpets.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Pet")
public class Pets{

    @Id
    @GeneratedValue

    @NotBlank @NonNull
    private @Getter @Setter Long id;
}