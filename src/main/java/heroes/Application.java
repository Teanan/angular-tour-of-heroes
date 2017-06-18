package heroes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

  private static final Logger log = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
  public CommandLineRunner demo(HeroRepository repository){
      return (args) -> {
        repository.save(new Hero("Mr. Nice"));
        repository.save(new Hero("Narco"));
        repository.save(new Hero("Bombasto"));
        repository.save(new Hero("Celeritas"));
        repository.save(new Hero("Magneta"));
        repository.save(new Hero("RubberMan"));
        repository.save(new Hero("Dynama"));
        repository.save(new Hero("Dr IQ"));
        repository.save(new Hero("Magma"));
        repository.save(new Hero("Tornad"));

        log.info("Heroes found with findAll():");
        for (Hero hero : repository.findAll()){
          log.info(hero.toString());
        }
      };
    }
}
