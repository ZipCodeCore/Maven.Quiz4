package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private Spice spices;

    public List<Spice> getAllSpices() {
        List<Spice> newlist = new ArrayList<>();
        newlist.add(spices);

        return (List<Spice>) spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        return null;
    }

    public void applySpice(Spice spice) {
        this.spices =spice;

    }
}
