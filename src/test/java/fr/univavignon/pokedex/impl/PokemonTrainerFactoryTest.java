package fr.univavignon.pokedex.impl;

import fr.univavignon.pokedex.api.IPokemonTrainerFactoryTest;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by klovelace on 5/3/17.
 * PROJECT: pokedex
 * PACKAGE: fr.univavignon.pokedex.impl
 */

public class PokemonTrainerFactoryTest extends IPokemonTrainerFactoryTest {
    @Before
    public void setUp() {
        pokedexFactory = new PokedexFactory();
        pokemonTrainerFactory = new PokemonTrainerFactory();
    }

}