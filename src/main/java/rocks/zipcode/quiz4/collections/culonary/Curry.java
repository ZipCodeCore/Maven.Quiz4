package rocks.zipcode.quiz4.collections.culonary;

public class Curry implements Spice {
    String name;

    public Curry(){
        this.name = "Curry";
    }

    @Override
    public String getName() {
        return name;
    }
}
