package rocks.zipcode.quiz4.collections.culonary;

import java.util.Objects;

/**
 * @author leon on 27/12/2018.
 */
public class Ginger implements Spice{

    private String name = "Ginger";

    public String getName(){

        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ginger)) return false;
        Ginger ginger = (Ginger) o;
        return name.equals(ginger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
