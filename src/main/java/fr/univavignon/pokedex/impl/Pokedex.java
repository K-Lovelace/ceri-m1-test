package fr.univavignon.pokedex.impl;

import fr.univavignon.pokedex.api.IPokedex;
import fr.univavignon.pokedex.api.PokedexException;
import fr.univavignon.pokedex.api.Pokemon;
import fr.univavignon.pokedex.api.PokemonMetadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by klovelace on 4/30/17.
 * PROJECT: pokedex
 * PACKAGE: fr.univavignon.pokedex.impl
 */

public class Pokedex implements IPokedex {
    private List<Pokemon> list;

    Pokedex() {
        this.list = new ArrayList<>();
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public int addPokemon(Pokemon pokemon) {
        this.list.add(pokemon);
        return this.list.size() - 1;
    }

    @Override
    public Pokemon getPokemon(int id) throws PokedexException {
        Pokemon pok;
        try {
            pok = this.list.get(id);
        } catch (IndexOutOfBoundsException e) {
            throw new PokedexException("Invalid index");
        }
        return pok;
    }

    @Override
    public List<Pokemon> getPokemons() {
        return Collections.unmodifiableList(this.list);
    }

    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        List<Pokemon> orderedList = new ArrayList<>(this.list);
        orderedList.sort(order);
        return Collections.unmodifiableList(orderedList);
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        return null;
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        return null;
    }
}
