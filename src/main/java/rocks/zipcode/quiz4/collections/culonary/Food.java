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

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<Spice, Integer> spiceMap = new HashMap<>();

        for(Spice spice : spices) {
            if(!spiceMap.containsKey(spice)){
                spiceMap.put(spice, 1);
            } else {
                int count = spiceMap.get(spice);
                spiceMap.put(spice, count + 1);
            }
        }
        return null;
    }

    public void applySpice(Spice spice) {
    }
}
