package heroes;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HeroRepository extends CrudRepository<Hero, Integer> {

  List<Hero> findByName(String name);

  List<Hero> findByNameContaining(String name);

}
