package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private List<Spice> spices;

    public Food() {
        this.spices = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return this.spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> map = new HashMap<>();
        for (Spice s : spices) {
            map.compute((SpiceType) s.getClass(), (k, v) -> (v == null) ? 1 : v + 1);
        }
        return map;
    }

    public void applySpice(Spice spice) {
        this.spices.add(spice);
    }
}
