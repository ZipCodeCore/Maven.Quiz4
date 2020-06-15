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
    private Map<Class<? extends Spice>, Integer> spiceTypeMap;

    public Food() {
        this.spices = new ArrayList<>();
        this.spiceTypeMap = new HashMap<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public Map<Class<? extends Spice>, Integer> getSpiceCount() {
        return spiceTypeMap;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
        spiceTypeMap.put(spice.getClass(), spiceTypeMap.getOrDefault(spice.getClass(), 0) + 1);
    }
}
