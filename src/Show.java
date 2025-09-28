import java.util.ArrayList;

public class Show {

    protected String title;
    protected int duration;
    protected Director ditector;
    protected ArrayList listOfActort;

    public Show(String title, int duration, Director ditector, ArrayList listOfActort) {
        this.title = title;
        this.duration = duration;
        this.ditector = ditector;
        this.listOfActort = listOfActort;
    }
}
