package heroes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HeroController {

  @Autowired
  HeroRepository repository;

  @RequestMapping(method = RequestMethod.GET, path = "/heroes")
  public List<Hero> getHeroes(@RequestParam(name="name", defaultValue = "") String name) {
    List<Hero> r = new ArrayList<>();

    Iterable<Hero> result = name.isEmpty() ?
      repository.findAll()
      : repository.findByNameContaining(name);

    for (Hero h : result){
      r.add(h);
    }

    return r;
  }

  @RequestMapping(method = RequestMethod.GET, path = "/heroes/{id}")
  public Hero greeting(@PathVariable(value = "id") int id) {
    return repository.findOne(id);
  }
}
