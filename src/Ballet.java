import java.util.ArrayList;

public class Ballet extends MusicalShow{
    protected Choreografer choreographer;

    public Ballet(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText, Choreografer choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}

