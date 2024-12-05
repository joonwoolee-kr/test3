package com.example.test3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test3.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
