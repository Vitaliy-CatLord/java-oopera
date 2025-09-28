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
            System.out.println("Актер "+ actor.name + " уже участвует в постановке");
        } else {
            listOfActor.add(actor);
            System.out.println("Актер " + actor.name + " добавлен в " + title);
        }
    }

    public void changeActor(Actor actor, Actor newActor) {
        if (listOfActor.contains(actor)) {
            listOfActor.set(listOfActor.indexOf(actor), newActor);
            System.out.println("\nАктер " + actor.name + " заменен актером " + newActor.name);
        } else {
            System.out.println("\nАктер " + actor.name + " не участвует в этой постановке");
        }

    }
}
