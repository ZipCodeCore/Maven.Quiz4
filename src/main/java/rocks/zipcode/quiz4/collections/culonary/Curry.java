package rocks.zipcode.quiz4.collections.culonary;

public class Curry implements Spice{
    String name;

    public Curry() {
        this.name = null;
    }

    public Curry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
