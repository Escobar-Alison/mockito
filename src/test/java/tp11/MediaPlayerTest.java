package tp11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp11.status.PausedMode;
import tp11.status.PlayingMode;
import tp11.status.SongSelectionMode;

import static org.junit.jupiter.api.Assertions.*;

public class MediaPlayerTest {
    private MediaPlayer player;

    @BeforeEach
    void setU(){
        player = new MediaPlayer();
    }

    @Test
    void verifyInitialState() {
        assertTrue(player.getMode() instanceof SongSelectionMode);
    }

    @Test
    void verifySongIsPlaying1() {
        player.play();

        assertTrue(player.getMode() instanceof PlayingMode);
        assertTrue(player.getPlaying());
    }

    @Test
    void verifySongIsPlaying2() {
        player.play();  //Reproduce la canción
        player.pause(); //Pausa la canción
        player.pause(); //Vuelve a reproducir la canción

        assertTrue(player.getMode() instanceof PlayingMode);
        assertTrue(player.getPlaying());
    }

    @Test
    void verifySongIsPaused() {
        player.play();
        player.pause();

        assertTrue(player.getMode() instanceof PausedMode);
        assertFalse(player.getPlaying());
    }

    @Test
    void verifyReturnsToInitialState1() {
        player.play();
        player.stop();

        assertTrue(player.getMode() instanceof SongSelectionMode);
        assertFalse(player.getPlaying());
    }

    @Test
    void verifyReturnsToInitialState2() {
        player.play();
        player.pause();
        player.stop();

        assertTrue(player.getMode() instanceof SongSelectionMode);
        assertFalse(player.getPlaying());
    }

    @Test
    void verifyPauseError1() {
        assertThrows(
                IllegalStateException.class,
                () -> player.pause()
        );
    }

    @Test
    void verifyPauseError2() {
        player.play();
        player.pause();

        assertThrows(
                IllegalStateException.class,
                () -> player.play()
        );
    }

    @Test
    void verifyPlayError() {
        player.play();

        assertThrows(
                IllegalStateException.class,
                () -> player.play()
        );
    }
}

/*
La firma básica es
assertThrows(TipoException.class, () -> { código });
Si la excepción no se lanza o es de un tipo diferente, la prueba falla
*/
