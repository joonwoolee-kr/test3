package com.example.test3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/rest")
@RequiredArgsConstructor
@Log4j2
@RestController
public class MovieRestController {

    @GetMapping("/list")
    public ResponseEntity<String> getMovieList() {
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> entity = rt
                .getForEntity("https://api.themoviedb.org/3/movie/popular?language=ko-KR&page=1&api_key="
                        + "a7e035c352858d4f14b0213f9415827c", String.class);
        String body = entity.getBody();
        return entity;
    }

}
