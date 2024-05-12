package dev.garug.movies.dtos.in;

import java.util.List;

public class TheaterIn {

    private List<List<Integer>> seats;

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }
}
