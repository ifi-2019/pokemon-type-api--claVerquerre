package com.ifi.controller;

import com.ifi.bo.PokemonType;
import com.ifi.repository.PokemonTypeRepository;

import java.util.Map;

public class PokemonTypeController {

    private PokemonTypeRepository repository = new PokemonTypeRepository();

    public PokemonType getPokemon(Map<String,String[]> parameters){
        try {
            return null;
        }
        catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("parameters should not be empty");
        }
    }
}
