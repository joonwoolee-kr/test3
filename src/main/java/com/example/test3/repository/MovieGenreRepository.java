package com.example.test3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test3.entity.MovieGenre;

public interface MovieGenreRepository extends JpaRepository<MovieGenre, Long> {

}