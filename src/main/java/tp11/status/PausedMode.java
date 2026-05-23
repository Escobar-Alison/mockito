package tp11.status;

import tp11.MediaPlayer;

public class PausedMode implements Mode {

    @Override
    public void play(MediaPlayer m) {
        throw new IllegalStateException("Está en pausa");
    }

    @Override
    public void pause(MediaPlayer m) {
        m.setMode(new PlayingMode());
        m.playSong();
    }

    @Override
    public void stop(MediaPlayer m) {
        m.setMode(new SongSelectionMode());
        m.pauseSong();
    }
}
