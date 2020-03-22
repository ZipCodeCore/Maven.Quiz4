package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private List<Spice> spices = new ArrayList<>();

    public Food() {
        this.spices = spices;
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        Map<SpiceType, Integer> spiceCount = new HashMap<>();

        for (Spice spice: spices) {
            if (spiceCount.containsKey(spice.getClass())) {
                spiceCount.put((SpiceType)spice.getClass(), spiceCount.get(spice.getClass()) +1);
            }
            else {
                spiceCount.put((SpiceType)spice.getClass(), 1);
            }
        }
        return spiceCount;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
