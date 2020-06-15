package rocks.zipcode.quiz4.collections.culonary;

import rocks.zipcode.quiz4.collections.WordCounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spiceList;

    public Food(){this.spiceList = new ArrayList<>();}

    private Map<Class<? extends Spice>, Integer> map;

    public List<Spice> getAllSpices() {
        return spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> spiceTypeIntegerMap = new HashMap<>();

        spiceList.forEach(spice -> WordCounter.incrementMap(spiceTypeIntegerMap, (SpiceType)spice.getClass()));

        return spiceTypeIntegerMap;
    }

    public void applySpice(Spice spice) {
        spiceList.add(spice);
    }
}
