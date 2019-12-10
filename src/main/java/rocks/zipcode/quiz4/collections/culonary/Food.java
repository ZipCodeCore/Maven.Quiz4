package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    List<Spice> allSpices = new ArrayList<>();

    public List<Spice> getAllSpices() {

        return allSpices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        Map<SpiceType, Integer> spiceCountMap = new HashMap<>();

        SpiceType spice = (SpiceType)this.allSpices.get(0).getClass();
        Integer spiceCount = this.allSpices.size();

        spiceCountMap.put(spice,spiceCount);
        return spiceCountMap;
    }

    public void applySpice(Spice spice) {
        allSpices.add(spice);
    }
}
