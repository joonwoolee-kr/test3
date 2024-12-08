package com.example.test3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.test3.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query("SELECT m.id, m.title, mg.genre.id, g.name FROM Movie m JOIN MoiveGenre mg ON m.id = mg.movie.id JOIN Genre g ON mg.genre.id = g.id WHERE m.id = :id")
    List<String> getGenreList(Long id);

}
