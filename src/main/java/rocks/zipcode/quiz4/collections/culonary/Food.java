package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food implements Spice{
    List<Spice>spiceList = new ArrayList<>();

    public List<Spice> getAllSpices() {
        return this.spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<Class<? extends Spice>, Integer> map = new HashMap<>();
        for (Spice spice : spiceList)
            if (!map.containsKey(spice)) {
                map.put(spice.getClass(), spiceList.size());
            } else {
                return null;
            }
       return (Map<SpiceType, Integer>) map;
    }
    public void applySpice(Spice spice) {
        spiceList.add(spice);
    }
}
