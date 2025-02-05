package com.example.PokemonAPI;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Pokemon {
    private String name;
    private int id;
    private int height;
    private int weight;
    private List<String> types;
}
