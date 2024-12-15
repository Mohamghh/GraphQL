package org.example.graphql;

import org.example.graphql.Enums.Genre;
import org.example.graphql.Model.Centre;
import org.example.graphql.Model.Etudiant;
import org.example.graphql.Repository.CentreRepository;
import org.example.graphql.Repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphQlApplication implements CommandLineRunner {

    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    CentreRepository centreRepository;

    public static void main(String[] args) {
        SpringApplication.run(GraphQlApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Centre centre1 = Centre.builder()
                .nom("Maarif").adresse("Biranzarane").build();
        centreRepository.save(centre1);
        Centre centre2 = Centre.builder()
                .nom("Oranges").adresse("Oulfa").build();
        centreRepository.save(centre2);
        Etudiant et1 = Etudiant.builder()
                .nom("Adnani").prenom("Brahim").genre(Genre.Homme)
                .centre(centre1).build();
        etudiantRepository.save(et1);

    }
}
