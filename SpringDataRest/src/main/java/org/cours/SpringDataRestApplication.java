package org.cours;

import org.cours.modele.Voiture;
import org.cours.modele.VoitureRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestApplication.class, args);
    }

    @Bean
    CommandLineRunner init(VoitureRepo voitureRepo) {
        return args -> {
            voitureRepo.save(new Voiture(null, "Toyota", "Corolla", "Blanc", "AA-123-AA", 2020, 180000));
            voitureRepo.save(new Voiture(null, "Renault", "Clio", "Rouge", "BB-456-BB", 2019, 120000));
            voitureRepo.save(new Voiture(null, "Peugeot", "208", "Noir", "CC-789-CC", 2021, 160000));
        };
    }
}
