package rocks.zipcode.quiz4.collections.culonary;

/**
 * @author leon on 27/12/2018.
 */
public class Ginger implements Spice{
    private static Ginger INSTANCE = new Ginger();

    static Ginger getInstance(){
        return INSTANCE;
    }
}
