package org.example.graphql.DTO;

import org.example.graphql.Enums.Genre;

public record EtudiantDTO(
        String nom,
        String prenom,
        Genre genre,
        Long centreId
) {
}
