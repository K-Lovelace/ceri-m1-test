package fr.univavignon.pokedex.impl;

import fr.univavignon.pokedex.api.IPokedexTest;
import org.junit.Before;

/**
 * Created by klovelace on 4/30/17.
 * PROJECT: pokedex
 * PACKAGE: fr.univavignon.pokedex.impl
 */

public class PokedexTest extends IPokedexTest {
    @Before
    public void setUp() {
        pokedex = new Pokedex();
    }

}