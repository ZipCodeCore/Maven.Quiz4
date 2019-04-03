package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private ArrayList<Spice> spices;

    public Food(ArrayList<Spice> spices) {
        this.spices = spices;
    }

    public Food() {
        this(new ArrayList<>());
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        LinkedHashMap<SpiceType, Integer> spiceMap = new LinkedHashMap<>();
        for (Spice spice : spices) {
            Class<? extends Spice> spiceType = spice.getClass();
            if(spiceMap.containsKey(spiceType)){
                spiceMap.put((SpiceType) spiceType, spiceMap.get(spiceType) + 1);
            }
            else {
                spiceMap.put((SpiceType) spiceType, 1);
            }
        }
        return spiceMap;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
