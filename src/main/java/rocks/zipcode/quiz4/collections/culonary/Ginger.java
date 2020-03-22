package rocks.zipcode.quiz4.collections.culonary;

/**
 * @author leon on 27/12/2018.
 */
public class Ginger implements Spice{
    String name;

    public Ginger() {
        this.name = null;
    }

    public Ginger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

