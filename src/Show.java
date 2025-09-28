import java.util.ArrayList;
import java.util.Arrays;

public class Show {

    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActor;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActor) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActor = listOfActor;
    }

    public void printActors() {
        System.out.println("Актеры спектакля:");
        System.out.println();
       for (Actor actor : listOfActor) {
           System.out.println(actor.toString());
       }
    }

    public void addActor (Actor actor) {
        if (listOfActor.contains(actor)) {
            System.out.println("Этот актер уже участвует в постановке");
        } else {
            listOfActor.add(actor);
            System.out.println("Актер добавлен в постановку");
        }
    }

    public void changeActor(Actor actor, Actor newActor) {

        listOfActor.set(listOfActor.indexOf(actor), newActor);
        System.out.println("Актер " + actor + "заменен актером " +newActor);

    }
}
