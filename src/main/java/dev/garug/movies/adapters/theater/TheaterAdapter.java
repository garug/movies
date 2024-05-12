package dev.garug.movies.adapters.theater;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.garug.movies.dtos.in.TheaterIn;
import dev.garug.movies.entities.Theater;
import org.springframework.stereotype.Component;

@Component
public class TheaterAdapter {

    final ObjectMapper objectMapper;

    public TheaterAdapter(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Theater inToEntity(TheaterIn in) throws JsonProcessingException {
        var entity = new Theater();
        entity.setSeats(objectMapper.writeValueAsString(in.getSeats()));
        return entity;
    }
}
