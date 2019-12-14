package rocks.zipcode.quiz4.collections.culonary;

public class Curry implements Spice{
    private static Curry INSTANCE = new Curry();
    private String name;

    static Curry getInstance(){

        return INSTANCE;
    }

    public String getName (){
        return name;
    }

}
