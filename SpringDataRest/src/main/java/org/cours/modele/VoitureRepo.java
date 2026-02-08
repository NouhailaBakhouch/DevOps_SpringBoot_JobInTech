package org.cours.modele;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:3000")
public interface VoitureRepo extends JpaRepository<Voiture, Long> {
}
