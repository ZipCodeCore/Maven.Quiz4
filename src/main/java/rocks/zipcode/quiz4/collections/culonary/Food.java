package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    ArrayList<Spice> spices = new ArrayList<>();


    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        HashMap<SpiceType,Integer> spiceCountMap = new HashMap<>();
        SpiceType spice = (SpiceType) this.spices.get(0).getClass();
        Integer spiceCount = this.spices.size();
        spiceCountMap.put(spice,spiceCount);


            return spiceCountMap;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
