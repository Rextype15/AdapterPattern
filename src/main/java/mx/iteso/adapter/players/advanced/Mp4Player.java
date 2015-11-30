package mx.iteso.adapter.players.advanced;

public class Mp4Player implements AdvancedMediaPlayer{

    public void playVlc() {
        playMp4();
    }

    public void playMp4() {
        System.out.println("Playing Mp4");
    }
}
