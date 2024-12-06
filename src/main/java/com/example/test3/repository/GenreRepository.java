package com.example.test3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test3.entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
