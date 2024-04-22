package com.project1.day6pagination.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.project1.day6pagination.model.Pokemon;
import com.project1.day6pagination.repository.PokemonRepo;

@Service
public class PokemonService 
{
    @Autowired
    PokemonRepo PR;

    public Page<Pokemon> getAllPokemons(int a,int b)
    {
        Pageable pa=PageRequest.of(a, b);
        return PR.findAll(pa);
    }

    public Optional<Pokemon> getById(int id)
    {
        return PR.findById(id);
    }

    public void newPokemon(Pokemon P)
    {
        PR.save(P);
    }

    public void newPokemons(List<Pokemon> P)
    {
        PR.saveAll(P);
    }

    public void updatePokemon(Pokemon P)
    {
        PR.save(P);
    }

    public void deleteById(int id)
    {
        PR.deleteById(id);
    }

    public void deleteAll()
    {
        PR.deleteAll();
    }

    public Pokemon getMaxHPPokemon()
    {
        return PR.findByMaxHP();
    }

    public Pokemon getMinHPPokemon()
    {
        return PR.findByMinHP();
    }

    public Pokemon findByName(String a)
    {
        return PR.findByName(a);
    }

    public List<Pokemon> getPokemonsByType(String Type)
    {
        List<Pokemon> P=PR.findAll();
        Iterator<Pokemon>it=P.iterator();
        aa:while(it.hasNext())
        {
            Pokemon p=it.next();
            List<String> T=p.getType();
            for(String S:T)
            if(S.equalsIgnoreCase(Type))
            continue aa;
            it.remove();
        }
        return P;
    }
    
    public List<Pokemon> getPokemonsByAttacks(String a)
    {
        List<Pokemon> P=PR.findAll();
        Iterator<Pokemon>it=P.iterator();
        aa:while(it.hasNext())
        {
            Pokemon p=it.next();
            List<String> A=p.getAttacks();
            for(String S:A)
            if(S.equalsIgnoreCase(a))
            continue aa;
            it.remove();
        }
        return P;
    }
    
    public List<Pokemon> getPokemonsByWeakness(String a)
    {
        List<Pokemon> P=PR.findAll();
        Iterator<Pokemon>it=P.iterator();
        aa:while(it.hasNext())
        {
            Pokemon p=it.next();
            List<String> W=p.getWeakness();
            for(String S:W)
            if(S.equalsIgnoreCase(a))
            continue aa;
            it.remove();
        }
        return P;

    }

}
