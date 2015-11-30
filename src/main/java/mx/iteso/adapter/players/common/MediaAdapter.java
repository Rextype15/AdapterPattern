package mx.iteso.adapter.players.common;

import mx.iteso.adapter.players.advanced.AdvancedMediaPlayer;

public class MediaAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(){

    }
    public void SetAdvancedMediaPlayer(AdvancedMediaPlayer player){
        this.advancedMediaPlayer = player;
    }

    public void play() {
        advancedMediaPlayer.playMp4();
    }
}
