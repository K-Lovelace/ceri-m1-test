package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public final class IPokedexFactoryTest {
    
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    
    @Mock
    private static IPokedexFactory pokedexFactory;
    
    @Mock
    private static IPokemonMetadataProvider pokemonMetadataProvider;
    
    @Mock
    private static IPokemonFactory pokemonFactory;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        IPokedex mockPokedex = mock(IPokedex.class);
        when(pokedexFactory.createPokedex(pokemonMetadataProvider, pokemonFactory))
                .thenReturn(mockPokedex);
    }
    
    @Test
    public void testCreatePokedex() {
        IPokedex newPokedex = pokedexFactory.createPokedex(pokemonMetadataProvider, pokemonFactory);
        //not null
        assertNotNull(newPokedex);
    }
}
