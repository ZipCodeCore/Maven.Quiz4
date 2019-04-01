package rocks.zipcode.quiz4.collections.culonary;

import rocks.zipcode.quiz4.collections.WordCounter;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private Map<Spice,Integer> spiceMap;

    public Food() {
        this.spiceMap = new LinkedHashMap<>();
    }

    public List<Spice> getAllSpices() {
        return new ArrayList<>(spiceMap.keySet());
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType,Integer> spiceTypeIntegerMap = new HashMap<>();

        spiceMap.keySet().forEach(spice -> spiceTypeIntegerMap.putIfAbsent((SpiceType) spice.getClass(),0));
        spiceMap.keySet().forEach(spice -> spiceTypeIntegerMap.put((SpiceType) spice.getClass(),spiceTypeIntegerMap.get(spice.getClass())+1));

        return spiceTypeIntegerMap;
    }

    public void applySpice(Spice spice) {
        spiceMap.putIfAbsent(spice,0);
        spiceMap.put(spice,spiceMap.get(spice)+1);
    }
}
