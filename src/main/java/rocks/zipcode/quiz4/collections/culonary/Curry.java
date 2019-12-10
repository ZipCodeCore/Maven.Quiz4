package rocks.zipcode.quiz4.collections.culonary;

public class Curry implements Spice{
    private static Curry INSTANCE = new Curry();

    static Curry getInstance(){
        return INSTANCE;
    }

}
