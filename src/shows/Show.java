package shows;

import persons.Actor;
import persons.Director;

import java.util.ArrayList;

public class Show {

    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActor = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }


    public void printActors() {
        System.out.println("Актеры :");
        for (Actor actor : listOfActor) {
           System.out.println(actor.toString());
       }
    }

    public void addActor (Actor actor) {
        if (listOfActor.contains(actor)) {
            System.out.println("Актер "+ actor.getName() + " уже участвует в постановке");
        } else {
            listOfActor.add(actor);
            System.out.println("Актер " + actor.getName()  + " добавлен в " + title);
        }
    }

    public void changeActor(Actor actor, Actor newActor) {
        if (listOfActor.contains(actor)) {
            listOfActor.set(listOfActor.indexOf(actor), newActor);
            System.out.println("\nАктер " + actor.getName()  + " заменен актером " + newActor.getName());
        } else {
            System.out.println("\nАктер " + actor.getName() + " не участвует в этой постановке");
        }

    }

    public String getDirector() {
        return director.toString();
    }
}
