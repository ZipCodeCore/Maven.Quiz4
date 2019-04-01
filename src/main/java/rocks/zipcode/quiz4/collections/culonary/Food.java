package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spices = new ArrayList<>();

    public List<Spice> getAllSpices() {
        return this.spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> map = new TreeMap<>();
//        for(int i = 0 ; i<spices.size(); i++){
//        }

        return null;
    }

    public void applySpice(Spice spice) {
        //spicesMap.put(spice, 1);
        spices.add(spice);
    }
}
