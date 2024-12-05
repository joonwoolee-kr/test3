package com.example.test3.repository;

import java.io.File;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
public class MovieRepositoryTest {
    @Test
    public void apiTest() throws ParseException {
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> entity = rt
                .getForEntity("https://api.themoviedb.org/3/movie/popular?language=ko-KR&page=1&api_key="
                        + "a7e035c352858d4f14b0213f9415827c", String.class);
        String body = entity.getBody();
        // System.out.println(body);

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(entity.getBody().toString());
        JSONArray jsonArray = (JSONArray) jsonObject.get("results");
        // System.out.println(jsonArray.get(0));
        JSONObject jsonObject2 = (JSONObject) jsonParser.parse(jsonArray.get(0).toString());
        System.out.println(jsonObject2.get("title"));

    }

    // @Test
    // public void insertTest() {
    // RestTemplate rt = new RestTemplate();
    // ResponseEntity<String> entity = rt
    // .getForEntity("https://api.themoviedb.org/3/movie/popular?language=ko-KR&page=1&api_key="
    // + "a7e035c352858d4f14b0213f9415827c", String.class);
    // String body = entity.getBody();

    // }
}
