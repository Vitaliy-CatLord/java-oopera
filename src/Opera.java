import java.util.ArrayList;

public class Opera extends MusicalShow{
    protected int choirSize;

    public Opera(String title, int duration, Director ditector, ArrayList listOfActort, String musicAuthor, String librettoText, int choirSize) {
        super(title, duration, ditector, listOfActort, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}
