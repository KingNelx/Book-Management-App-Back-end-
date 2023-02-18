package backendpets.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Pets implements test{

  @Id
  @GeneratedValue

  private  @Getter @Setter Long ssid;

  private @Getter String name;

  @Override
  public String ERROR_NULL(){
    return " NULL DETECTED ";
  }
  public void setName(String name){
    if(name == null)
        throw new IllegalArgumentException(ERROR_NULL());
    this.name = name;
  }

}

interface test{
    public String ERROR_NULL();
}