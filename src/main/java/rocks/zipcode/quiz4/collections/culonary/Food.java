package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    List<Spice> spices = new ArrayList<>();

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<Class<? extends Spice>, Integer> spiceMap = new HashMap<>();

        for (int i = 0; i < spices.size(); i++) {
            if (!spiceMap.containsKey(spices.get(i).getClass())){
                spiceMap.put(spices.get(i).getClass(), 1);
            }else{
                spiceMap.put(spices.get(i).getClass(), spiceMap.get(spices.get(i).getClass()) + 1);
            }
        }
        return (Map<SpiceType, Integer>) spiceMap;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
