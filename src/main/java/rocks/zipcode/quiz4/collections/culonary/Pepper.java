package rocks.zipcode.quiz4.collections.culonary;

/**
 * @author leon on 27/12/2018.
 */
public class Pepper implements Spice{
    String name;

    public Pepper(){
        this.name = "Pepper";
    }

    @Override
    public String getName() {
        return name;
    }
}
