package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.*;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.when;

public final class IPokemonMetadataProviderTest {
    
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    
    @Mock
    private static IPokemonMetadataProvider pokemonMetadataProvider;
    
    @Before
    public void setUp() throws PokedexException {
        MockitoAnnotations.initMocks(this);
        when(pokemonMetadataProvider.getPokemonMetadata(0)).thenReturn(new PokemonMetadata(0, "Bulbizarre", 126, 126, 90));
    }
    
    @Test
    public void testGetPokemonMetadata() throws PokedexException {
        Assert.assertEquals("Bulbizarre", pokemonMetadataProvider.getPokemonMetadata(0).getName());
    }
}
