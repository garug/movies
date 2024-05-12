package dev.garug.movies.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String seats;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }
}
