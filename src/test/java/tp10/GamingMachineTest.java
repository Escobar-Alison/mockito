package tp10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp10.status.AwaitingToken;
import tp10.status.Playing;
import tp10.status.WithAToken;
import tp10.status.WithTwoTokens;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GamingMachineTest {
    private GamingMachine machine;

    @BeforeEach
    void setUp() {
        machine = new GamingMachine();

    }

    @Test
    void verifyInitialState() {
        assertTrue(machine.getStatus() instanceof AwaitingToken);
        //instanceof en Java es un operador de comparación binario utilizado para verificar si un objeto es una instancia de una clase específica
    }

    @Test
    void verifyOnePlayerState() {
        machine.insertToken();

        assertTrue(machine.getStatus() instanceof WithAToken);
    }

    @Test
    void verifyTwoPlayerState() {
        machine.insertToken();
        machine.insertToken();

        assertTrue(machine.getStatus() instanceof WithTwoTokens);
    }

    @Test
    void verifyPlayingState1() {
        machine.insertToken();
        machine.pressButton();

        assertTrue(machine.getStatus() instanceof Playing);
        assertEquals(1, machine.getPlayers());

    }

    @Test
    void verifyPlayingState2() {
        machine.insertToken();
        machine.insertToken();
        machine.pressButton();

        assertTrue(machine.getStatus() instanceof Playing);
        assertEquals(2, machine.getPlayers());
    }

    @Test
    void verifyReturnedToInitialState() {
        machine.gameOver();

        assertTrue(machine.getStatus() instanceof AwaitingToken);
    }
}
