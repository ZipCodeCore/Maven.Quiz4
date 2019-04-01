package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private Map<Spice, Integer> spiceIntegerMap;

    public Food() {
        this.spiceIntegerMap = new LinkedHashMap<>();
    }

    public Food(List<Spice> spices) {
        this();
        getSpiceFrequencies(spices);
    }

    private void getSpiceFrequencies(List<Spice> spices) {
        for (Spice spice : spices) {
            applySpice(spice);
        }
    }

    public List<Spice> getAllSpices() {
        return new ArrayList<>(spiceIntegerMap.keySet());
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        return mapTypes();
    }

    private <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> mapTypes() {
        Map<SpiceType, Integer> spiceTypeIntegerMap = new HashMap<>();
        for (Spice spice : spiceIntegerMap.keySet()) {
            SpiceType spiceType = (SpiceType) spice.getClass();
            if (!spiceTypeIntegerMap.containsKey(spiceType)) {
                spiceTypeIntegerMap.put(spiceType, 0);
            }
            spiceTypeIntegerMap.put(spiceType, spiceTypeIntegerMap.get(spiceType) + 1);
        }
        return spiceTypeIntegerMap;
    }

    public void applySpice(Spice spice) {
        if (!spiceIntegerMap.containsKey(spice)) {
            spiceIntegerMap.put(spice, 0);
        }
        spiceIntegerMap.put(spice, spiceIntegerMap.get(spice) + 1);
    }
}
