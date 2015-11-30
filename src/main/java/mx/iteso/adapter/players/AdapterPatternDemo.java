package mx.iteso.adapter.players;

import mx.iteso.adapter.players.common.AudioPlayer;

public class AdapterPatternDemo {

    public static void main(String[] args){
        AudioPlayer aPlayer = new AudioPlayer();
        aPlayer.play();
        aPlayer.playVlc();
        aPlayer.playMP4();
    }
}
