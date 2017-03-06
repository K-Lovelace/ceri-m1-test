package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by lovelacez on 3/6/17.
 */
public final class IPokemonMetadataProviderTest extends TestCase {

    @Mock
    private static IPokemonMetadataProvider pokemonMetadataProvider;
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    
    @Before
    public void setUp() throws PokedexException {
        when(pokemonMetadataProvider.getPokemonMetadata(0)).thenReturn(new PokemonMetadata(0, "Bulbizarre", 126, 126, 90));
    }
    
    @Test
    public void testGetPokemonMetadata() throws PokedexException {
        assertEquals(pokemonMetadataProvider.getPokemonMetadata(0), new PokemonMetadata(0, "Bulbizarre", 126, 126, 90));
    }
}
