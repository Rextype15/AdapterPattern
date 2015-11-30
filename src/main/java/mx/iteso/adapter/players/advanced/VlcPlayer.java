package mx.iteso.adapter.players.advanced;

public class VlcPlayer implements AdvancedMediaPlayer {

    public void playVlc() {
        System.out.println("Playing Vlc");
    }

    public void playMp4() {
        playVlc();
    }
}
