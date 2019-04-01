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
        spices = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        Map<SpiceType,Integer> spiceTypeIntegerMap = new HashMap<>();
        for(Spice spice:spices) {
            spiceTypeIntegerMap.putIfAbsent((SpiceType) spice.getClass(), 0);
            spiceTypeIntegerMap.put((SpiceType) spice.getClass(),spiceTypeIntegerMap.get((SpiceType) spice.getClass())+1);
        }
        return spiceTypeIntegerMap;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
