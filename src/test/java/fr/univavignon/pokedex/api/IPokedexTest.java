package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
import static org.mockito.Mockito.when;


public final class IPokedexTest {
    
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    
    @Mock
    private static IPokedex pokedex;
    
    private static Pokemon bulbizarre = new Pokemon(
            0,
            "Bulbizarre",
            126,
            126,
            90,
            613,
            64,
            4000,
            4,
            56
    );
    
    @Before
    public void setUp() throws PokedexException {
        MockitoAnnotations.initMocks(this);
        when(pokedex.size()).thenReturn(151);
        when(pokedex.getPokemon(0)).thenReturn(bulbizarre);
        when(pokedex.getPokemon(200)).thenThrow(new PokedexException("Invalid index"));
    }
    
    @Test
    public void testSize() {
        assertEquals(151, pokedex.size());
    }
    
    @Test
    public void testAddPokemon() {
        assertEquals(0, pokedex.addPokemon(bulbizarre));
    }
    
    @Test
    public void testGetPokemon() throws PokedexException {
        pokedex.addPokemon(bulbizarre);
        
        assertEquals(bulbizarre, pokedex.getPokemon(0));
        
        try {
            pokedex.getPokemon(200);
            fail("Expected a PokedexException to be thrown");
        } catch(PokedexException e) {
            assertEquals("Invalid index", e.getMessage());
        }
    }
}
