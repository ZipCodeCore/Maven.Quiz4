package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    List<Spice> spices;

    public Food() {
        this.spices = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> spiceCountMap = new HashMap<>();
        for (Spice spice : spices) {
            SpiceType type = (SpiceType) spice.getClass();
            if(spiceCountMap.putIfAbsent(type, 1) != null) {
                Integer count = spiceCountMap.get(type) + 1;
                spiceCountMap.replace(type, count);
            }
        }
        return spiceCountMap;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }

}
