package fr.univavignon.pokedex.impl;

import fr.univavignon.pokedex.api.IPokedexFactoryTest;
import fr.univavignon.pokedex.api.IPokemonFactoryTest;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by klovelace on 4/24/17.
 * PROJECT: pokedex
 * PACKAGE: fr.univavignon.pokedex.impl
 */

public class PokemonFactoryTest extends IPokemonFactoryTest {
    @Before
    public void setUp() {
        pokemonFactory = new PokemonFactory();
    }

}