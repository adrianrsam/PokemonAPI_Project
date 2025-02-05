package com.example.PokemonAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class PokemonController {

    private final String API_URL = "https://pokeapi.co/api/v2/pokemon/";

    @GetMapping("/pokemon")
    public Pokemon getPokemon(@RequestParam String name) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> response = restTemplate.getForObject(API_URL + name, Map.class);

        if (response == null) {
            return null;
        }

        Pokemon pokemon = new Pokemon();
        pokemon.setName((String) response.get("name"));
        pokemon.setId((Integer) response.get("id"));
        pokemon.setHeight((Integer) response.get("height"));
        pokemon.setWeight((Integer) response.get("weight"));

        List<String> types = new ArrayList<>();
        List<Map<String, Object>> typesList = (List<Map<String, Object>>) response.get("types");
        for (Map<String, Object> typeEntry : typesList) {
            Map<String, Object> typeData = (Map<String, Object>) typeEntry.get("type");
            types.add((String) typeData.get("name"));
        }
        pokemon.setTypes(types);

        return pokemon;
    }
}
