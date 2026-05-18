package tp9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static tp9.Valor.*;

public class CartaTest {
    Carta c0;
    Carta c1;
    Carta c2;
    Carta c3;
    Carta c4;
    Carta c5;

    @BeforeEach
    void Setup() {
        c0 = new Carta(A, "T");
        c1 = new Carta(SIETE, "T");
        c2 = new Carta(DIEZ, "D");
        c3 = new Carta(J, "T");
        c4 = new Carta(Q, "T");
        c5 = new Carta(K, "T");
    }

    //1
    @Test
    void verificaQueKSeaSuperiorAQ() {
        assertTrue(c5.esSuperiorA(c4));
    }

    @Test
    void verificaQueQSeaSuperiorAJ() {
        assertTrue(c4.esSuperiorA(c3));
    }

    @Test
    void verificaQueJSeaSuperiorA10() {
        assertTrue(c3.esSuperiorA(c2));
    }
    @Test
    void verificaQue10SeaSuperiorA7() {
        assertTrue(c2.esSuperiorA(c1));
    }

    @Test
    void verificaQueASeaSuperiorAl7() {
        assertTrue(c0.esSuperiorA(c1));
    }

    @Test
    void verificaQueASeaSuperiorAlK() {
        assertTrue(c0.esSuperiorA(c5));
    }

    //2
    @Test
    void verificaQueSonDelMismoPalo() {
        assertTrue(c0.sonDelMismoPalo(c1));
    }

    @Test
    void verificaQueNoSonDelMismoPalo() {
        assertFalse(c2.sonDelMismoPalo(c1));
    }

}
