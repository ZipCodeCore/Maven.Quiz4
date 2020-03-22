package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    List<Spice> spices = new ArrayList<>();
    public List<Spice> getAllSpices() {

        return this.spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> spiceMap = new HashMap<>();
        spiceMap.put((SpiceType) spices.get(0).getClass(), spices.size());
        return spiceMap;
    }

    public void applySpice(Spice spice) {
        this.spices.add(spice);
    }
}
