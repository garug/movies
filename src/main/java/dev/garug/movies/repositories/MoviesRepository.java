package dev.garug.movies.repositories;

import dev.garug.movies.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MoviesRepository extends JpaRepository<Movie, UUID> {
}
