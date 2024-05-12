package dev.garug.movies.repositories;

import dev.garug.movies.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TicketsRepository extends JpaRepository<Ticket, UUID> {
}
