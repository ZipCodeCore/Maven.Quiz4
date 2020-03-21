package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spiceList;
    private Map<Class<? extends Spice>, Integer> spiceMap;

    public Food() {
        this.spiceList = new ArrayList<>();
        this.spiceMap = new HashMap<>();
    }

    public List<Spice> getAllSpices() {
        return spiceList;
    }



    public Map<Class<?  extends Spice>, Integer> getSpiceCount() {


        return spiceMap;
    }

    public void applySpice(Spice spice) {
        if (!spiceMap.containsKey(spice.getClass())) {
            spiceMap.put(spice.getClass(), 1);
        } else {
            int numOfSpice = spiceMap.get(spice.getClass());
            spiceMap.put(spice.getClass(), numOfSpice + 1);
        }
        spiceList.add(spice);

    }


}
