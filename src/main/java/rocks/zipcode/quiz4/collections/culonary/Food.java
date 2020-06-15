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

    public Food() {
        spices = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> result = new HashMap<>();
        for (int i = 0; i < spices.size(); i++) {
            SpiceType st = (SpiceType) spices.get(i).getClass();
            if (result.containsKey(st)) {
                Integer value = result.get(st);
                result.put(st, value + 1);
            } else {
                result.put(st, 1);
            }
        }
        return result;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
