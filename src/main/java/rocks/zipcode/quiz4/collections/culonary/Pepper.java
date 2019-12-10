package rocks.zipcode.quiz4.collections.culonary;

import java.util.Objects;

/**
 * @author leon on 27/12/2018.
 */
public class Pepper implements Spice{
    private  String name ="pepper";
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pepper)) return false;
        Pepper pepper = (Pepper) o;
        return Objects.equals(name, pepper.name);
    }
}
