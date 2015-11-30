package mx.iteso.adapter.players.common;

import mx.iteso.adapter.players.advanced.Mp4Player;
import mx.iteso.adapter.players.advanced.VlcPlayer;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter = new MediaAdapter();

    public void play() {
        System.out.println("Playing MP3");
    }

    public void playMP4(){
        mediaAdapter.SetAdvancedMediaPlayer(new Mp4Player());
        mediaAdapter.play();
    }

    public void playVlc(){
        mediaAdapter.SetAdvancedMediaPlayer(new VlcPlayer());
        mediaAdapter.play();
    }


}
