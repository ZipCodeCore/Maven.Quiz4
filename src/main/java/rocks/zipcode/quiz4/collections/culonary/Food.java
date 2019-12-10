package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food <SpiceType extends Class<? extends Spice>>{

    private ArrayList<Spice> allSpices = new ArrayList<>();
    private HashMap<SpiceType, Integer> spiceCountMap = new HashMap<>();

    public List<Spice> getAllSpices() {
        return allSpices;
    }

    public Map<SpiceType, Integer> getSpiceCount() {
        return spiceCountMap;
    }

    public void applySpice(Spice spice) {
        // STICK IT IN THE ArrayList
        allSpices.add(spice);
        // THEN STICK IT IN THE HashMap
        if (!spiceCountMap.keySet().contains((SpiceType)spice.getClass())) {
            spiceCountMap.put((SpiceType) spice.getClass(), 1);
        }
        else {spiceCountMap.replace((SpiceType)spice.getClass(), spiceCountMap.get((SpiceType)spice.getClass())+1);}
    }

}
