package tp9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PokerStatusTest {
    PokerStatus pkr;
    List<String> csNada;
    List<String> csPkr;
    List<String> csClr;
    List<String> csT;

    @BeforeEach
    void Setup() {
        pkr = new PokerStatus();
        csNada = Arrays.asList("10D", "10C", "JP", "AT", "AP");
        csPkr  = Arrays.asList("AP", "AC", "AD", "AT", "7P");
        csClr  = Arrays.asList("10D", "9D", "3D", "4D", "9D");
        csT    = Arrays.asList("3D", "3T", "3P", "6T", "JP");

    }

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

    @Test
    void verficaQueEsPoker() {
        assertEquals("Poquer", pkr.verificar("AP", "AC", "AD", "AT", "7P"));
    }

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
}
