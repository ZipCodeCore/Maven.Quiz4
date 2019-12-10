package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private Map<Class<? extends Spice>, Integer> spiceCount = new LinkedHashMap<>();
    private List<Spice> spices = new ArrayList<>();

    public List<Spice> getAllSpices() {
        return spices;
    }

    public Map<Class<? extends Spice>, Integer> getSpiceCount() {
        return spiceCount;
    }

    public void applySpice(Spice spice) {
        spiceCount.putIfAbsent(spice.getClass(), 0);
        spiceCount.replace(spice.getClass(),spiceCount.get(spice.getClass()) + 1);

        spices.add(spice);
    }
}
