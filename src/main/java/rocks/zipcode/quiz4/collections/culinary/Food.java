package rocks.zipcode.quiz4.collections.culinary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    Map<Spice, Integer> spiceMap;

    public Food() {
        this.spiceMap = new HashMap();
    }

    public List<Spice> getAllSpices() {
        List<Spice> spices = new ArrayList(spiceMap.keySet());
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

//        for (Spice spice : list) {
//            map.put(spice.getClass(), Collections.frequency(list, spice));
//        }
        return null;
    }


    public void applySpice(Spice spice) {
//        if (spiceMap.containsKey(spice)) {
//            spiceMap.get(spice);
//            spiceMap.replace(spice, spiceMap.get(spice) + 1);
//        } else if (!spiceMap.containsKey(spice)) {
//            spiceMap.put(spice, 1);
//        }
    }
}