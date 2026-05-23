package tp11.status;

import tp11.MediaPlayer;

public interface Mode {

    public void play(MediaPlayer m);

    public void pause(MediaPlayer m);

    public void stop(MediaPlayer m);
}
