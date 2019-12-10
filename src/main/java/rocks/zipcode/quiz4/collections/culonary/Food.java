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
        spices = new ArrayList<Spice>();
    }

    public List<Spice> getAllSpices() {
        return this.spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> out = new HashMap<>();
        for (Spice spice: spices) {
            int count = 1;
            if (out.containsKey(spice.getClass())) {
                count = out.get(spice.getClass());
                count++;
            }
            out.put((SpiceType) spice.getClass(), count);
        }
        return out;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
