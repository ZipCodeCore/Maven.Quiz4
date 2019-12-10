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
    private HashMap<SpiceType, Integer> spiceCountMap;

    public List<Spice> getAllSpices() {
        return allSpices;
    }

    public Map<SpiceType, Integer> getSpiceCount() {
        return spiceCountMap;
    }

    public void applySpice(Spice spice) {
        allSpices.add(spice);
    }
}
