package dev.garug.movies.repositories;

import dev.garug.movies.entities.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TheatersRepository extends JpaRepository<Theater, UUID> {
}
