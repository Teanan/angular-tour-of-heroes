package heroes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hero {
  @Id
  @GeneratedValue
  private int id;

  private String name;

  public Hero() {
    this.name = name;
  }

  public Hero(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return String.format("Hero [id=%s, name=%s]", id, name);
  }
}
