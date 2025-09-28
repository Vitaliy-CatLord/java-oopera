import java.util.ArrayList;

public class MusicalShow extends Show{
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director ditector, ArrayList listOfActort, String musicAuthor, String librettoText) {
        super(title, duration, ditector, listOfActort);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
}
