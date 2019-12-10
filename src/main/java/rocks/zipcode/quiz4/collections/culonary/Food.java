package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spices;

    public Food() {
        this.spices = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> map = new HashMap<>();
        SpiceType spiceType;

        for (Spice spice: spices) {
            spiceType = (SpiceType) spice.getClass();
            if (!map.containsKey(spiceType)) {  // first time we've seen this string
                map.put(spiceType, 1);
            }
            else {
                int count = map.get(spiceType);
                map.put(spiceType, count + 1);
            }
        }
        return map;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
