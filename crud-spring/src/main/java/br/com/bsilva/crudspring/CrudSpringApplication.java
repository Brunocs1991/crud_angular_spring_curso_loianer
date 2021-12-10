package br.com.bsilva.crudspring;

import br.com.bsilva.crudspring.model.Course;
import br.com.bsilva.crudspring.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringApplication.class, args);
    }

    @Bean
    CommandLineRunner initDataBase(CourseRepository repository){
        return args -> {
            repository.deleteAll();
            Course c = new Course();
            c.setId(1l);
            c.setName("Angular com Spring");
            c.setCategory("front-end");
            repository.save(c);
        };
    }
}
