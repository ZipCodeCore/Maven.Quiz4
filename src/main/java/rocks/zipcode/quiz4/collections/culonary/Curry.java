package rocks.zipcode.quiz4.collections.culonary;

public class Curry implements Spice {
    private String name;
    public Curry(){
        this.name= this.getClass().getSimpleName();
    }

    @Override
    public String getName() {
        return name;
    }
}
