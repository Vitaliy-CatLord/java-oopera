import java.util.ArrayList;

public class MusicalShow extends Show{
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActor, String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActor);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public String printLibletto () {
        return librettoText;
    }
}
