package tp9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.tp9.PokerStatus;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokerStatusTest {
    PokerStatus pkr;

    @BeforeEach
    void Setup() {
        pkr = new PokerStatus();
    }

    @Test
    void verificaQueHayPoker() {
        assertTrue(pkr.verificar("AP", "AC", "AD", "AT", "7P"));
    }

    @Test
    void verificaQueNoHayPoker() {
        assertFalse(pkr.verificar("10D", "10C", "JC", "AT", "10P"));
    }
}
