package rocks.zipcode.quiz4.collections.culonary;

import java.util.Objects;

public class Curry implements  Spice{

    private String name = "Curry";

    public String getName(){

        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curry)) return false;
        Curry curry = (Curry) o;
        return name.equals(curry.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
