package dev.garug.movies.repositories;

import dev.garug.movies.entities.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ScreeningsRepository extends JpaRepository<Screening, UUID> {
}
