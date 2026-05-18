package tp9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PokerStatusTest {
    PokerStatus pkr;
    Carta ap;
    Carta ad;
    Carta at;
    Carta ac;
    Carta sevenp;

    @BeforeEach
    void Setup() {
        pkr = new PokerStatus();

        ap = mock(Carta.class);
        when(ap.getValor()).thenReturn(1);
        when(ap.getPalo()).thenReturn("P");

        ad = mock(Carta.class);
        when(ad.getValor()).thenReturn(1);

        ac = mock(Carta.class);
        when(ac.getValor()).thenReturn(1);

        at = mock(Carta.class);
        when(at.getValor()).thenReturn(1);

        sevenp = mock(Carta.class);
        when(sevenp.getValor()).thenReturn(7);

        //csPkr  = Arrays.asList("AP", "AC", "AD", "AT", "7P");
        //csClr  = Arrays.asList("10D", "9D", "3D", "4D", "9D");
        //csT    = Arrays.asList("3D", "3T", "3P", "6T", "JP");

    }
/*
    @Test
    void verificaQueHayPoker() {
        assertTrue(pkr.esPoker(csPkr));
    }

    @Test
    void verificaQueNoHayPoker() {
        assertFalse(pkr.esPoker(csNada));
    }

    @Test
    void verificaQueHayColor() {
        assertTrue(pkr.esColor(csClr));
    }

    @Test
    void verificaQueNoHayColor() {
        assertFalse(pkr.esColor(csNada));
    }

    @Test
    void verificaQueHayTrio() {
        assertTrue(pkr.esTrio(csT));
    }

    @Test
    void verificaQueNoHayTrio() {
        assertFalse(pkr.esTrio(csNada));
    }
*/

    @Nested
    public class Verificacion {
        @Test
        void verficaQueEsPoker() {
            assertEquals("Poquer", pkr.verificar(ap, ad, ac, at, sevenp));
            verify(ap, times(1)).getValor();
        }

/*
        @Test
        void verficaQueEsColor() {
            assertEquals("Color", pkr.verificar("10D", "9D", "3D", "4D", "9D"));
        }

        @Test
        void verficaQueEsTrio() {
            assertEquals("Trio", pkr.verificar("3D", "3T", "3P", "6T", "JP"));
        }

        @Test
        void verficaQueNoHaYJugada() {
            assertEquals("Sin jugada", pkr.verificar("10D", "10C", "JP", "AT", "AP"));
        }

 */
    }
}
