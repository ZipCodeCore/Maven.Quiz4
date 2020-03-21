package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private Map<Class<? extends Spice>, Integer> spiceMap;
    private List<Spice> spiceList;

    public Food() {
        spiceMap = new HashMap<>();
        spiceList = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spiceList;
    }

    public Map<Class<? extends Spice>, Integer> getSpiceCount() {
        return spiceMap;
    }

    public void applySpice(Spice spice) {
        spiceList.add(spice);

        if(!spiceMap.containsKey((spice.getClass()))){
            spiceMap.put(spice.getClass(), 1);
        } else {
            Integer newAmount = spiceMap.get(spice.getClass());
            spiceMap. put(spice.getClass(), newAmount + 1);
        }
    }
}

