package tp11.status;

import tp11.MediaPlayer;

public class PlayingMode implements Mode {
    @Override
    public void play(MediaPlayer m) {
        throw new IllegalStateException("Ya se está reproduciendo una canción");
    }

    @Override
    public void pause(MediaPlayer m) {
        m.setMode(new PausedMode());
        m.pauseSong();
    }

    @Override
    public void stop(MediaPlayer m) {
        m.setMode(new SongSelectionMode());
        m.pauseSong();
    }
}

/*
Para tener una clase para excepciones
Throwable
├── Error
└── Exception
     └── RuntimeException
solo los objetos que heredan de Throwable pueden ser lanzados con throw
*/
