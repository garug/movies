package dev.garug.movies.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import dev.garug.movies.adapters.theater.TheaterAdapter;
import dev.garug.movies.dtos.in.TheaterIn;
import dev.garug.movies.entities.Theater;
import dev.garug.movies.repositories.TheatersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theaters")
public class TheatersController {

    final TheatersRepository repository;

    final TheaterAdapter adapter;

    public TheatersController(TheatersRepository repository, TheaterAdapter adapter) {
        this.repository = repository;
        this.adapter = adapter;
    }

    @GetMapping
    public List<Theater> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Theater create(@RequestBody TheaterIn in) throws JsonProcessingException {
        var entity = adapter.inToEntity(in);
        return repository.save(entity);
    }
}
