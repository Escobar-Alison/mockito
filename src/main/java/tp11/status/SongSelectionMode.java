package tp11.status;

import tp11.MediaPlayer;

public class SongSelectionMode implements Mode {
    @Override
    public void play(MediaPlayer m) {
        m.setMode(new PlayingMode());
        m.playSong();
    }

    @Override
    public void pause(MediaPlayer m) {
        throw new IllegalStateException("No hay ninguna canción reproduciendo");
    }

    @Override
    public void stop(MediaPlayer m) { }
}
