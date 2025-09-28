import java.util.ArrayList;

public class Ballet extends MusicalShow{
    protected String choreographer;

    public Ballet(String title, int duration, Director ditector, ArrayList listOfActort, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, ditector, listOfActort, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
