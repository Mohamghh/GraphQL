package org.example.graphql.Repository;

import org.example.graphql.Model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CentreRepository extends JpaRepository<Centre, Long> {
}
