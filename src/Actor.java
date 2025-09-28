import java.util.Objects;

public class Actor extends Person {
    protected int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        String result = name + " " + surname + " (Рост: " + height + ").";
        return result;
    }

    @Override
    public  boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (this.getClass() != object.getClass()) return false;
        Actor actor = (Actor) object;
        return Objects.equals(this.name, actor.name) &&
                Objects.equals(this.surname, actor.surname) &&
                Objects.equals(this.height, actor.height);
    }

}
