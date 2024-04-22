package com.project1.day6pagination.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day6pagination.model.Pokemon;
import com.project1.day6pagination.service.PokemonService;

@RestController
public class PokemonController 
{
    @Autowired
    PokemonService PS;

    @PostMapping("/Pokemons/newPokemon")
    public void newPokemon(@RequestBody Pokemon P)
    {
        PS.newPokemon(P);
    }

    @PostMapping("/Pokemons/newPokemons")
    public void newPokemons(@RequestBody List<Pokemon> P)
    {
        PS.newPokemons(P);
    }

    @PutMapping("/Pokemons/updatePokemon/{pokemonId}")
    public void updatePokemon(@RequestBody Pokemon P,@PathVariable int pokemonId)
    {
        PS.updatePokemon(P);
    }

    @GetMapping("/Pokemons")
    public Page<Pokemon> getAllPokemons(@RequestParam(defaultValue = "0") int pageNo,@RequestParam(defaultValue = "2") int pageSize)
    {
        return PS.getAllPokemons(pageNo,pageSize);
    }

    @GetMapping("/Pokemons/{pokemonId}")
    public Optional<Pokemon> getById(@PathVariable int pokemonId)
    {
        return PS.getById(pokemonId);
    }

    @GetMapping("/Pokemons/MaxHP")
    public Pokemon getMaxHP()
    {
        return PS.getMaxHPPokemon();
    }

    @GetMapping("/Pokemons/MinHP")
    public Pokemon getMinxHP()
    {
        return PS.getMinHPPokemon();
    }

    @GetMapping("/Pokemons/Name/{name}")
    public Pokemon getPokemonByName(@PathVariable String name)
    {
        return PS.findByName(name);
    }

    @GetMapping("/Pokemons/Type/{type}")
    public List<Pokemon> getPokemonsByType(@PathVariable String type)
    {
        return PS.getPokemonsByType(type);
    }
    @GetMapping("/Pokemons/Attack/{Attack}")
    public List<Pokemon> getPokemonsByAttack(@PathVariable String Attack)
    {
        return PS.getPokemonsByAttacks(Attack);
    }

    @GetMapping("/Pokemons/Weakness/{weak}")
    public List<Pokemon> getPokemonsByWeakness(@PathVariable String weak)
    {
        return PS.getPokemonsByWeakness(weak);
    }
    
    @DeleteMapping("/Pokemons/{pokemonId}")
    public void deleteById(@PathVariable int pokemonId)
    {
        PS.deleteById(pokemonId);
    }

    @DeleteMapping("/Pokemons")
    public void deleteAll()
    {
        PS.deleteAll();
    }
}
