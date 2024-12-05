package com.example.test3.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.test3.entity.Movie;

public class MovieServiceImpl implements MovieService {

    @Override
    public List<Movie> getList() {
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> entity = rt
                .getForEntity("https://api.themoviedb.org/3/movie/popular?language=ko-KR&page=1&api_key="
                        + "a7e035c352858d4f14b0213f9415827c", String.class);
        String body = entity.getBody();
        return null;
    }

}
