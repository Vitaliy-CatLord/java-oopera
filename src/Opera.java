import java.util.ArrayList;

public class Opera extends MusicalShow{
    protected int choirSize;

    public Opera(String title, int duration, Director director,  MusicAuthor musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
