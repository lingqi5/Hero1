package Game;

public class Main {
    public static void main(String[] args) {
        new Start();
        String filepath = "D:\\zhang\\MUSIC\\bgm.wav";
        music musicObject = new music();
        musicObject.playMusic(filepath);
    }
}
