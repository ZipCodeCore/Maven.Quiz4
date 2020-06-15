package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private List<Spice> spicesAdded;

    public List<Spice> getAllSpices() {
        return spicesAdded;
    }

    public Food() {
        this.spicesAdded = new ArrayList<>();
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> map = new HashMap<>();
//        for (Spice s: spicesAdded) {
//            SpiceType spice = (SpiceType)s.getClass();
//            if(map.containsKey(spice)){
//                map.replace(spice, map.get(spice),map.get(spice) +1);
//            }else {
//                map.put(spice,1);
//            }
//        }
//        return map;
        for(Spice s: spicesAdded){
            map.compute((SpiceType)s.getClass(), (k,v) -> (v == null) ? 1: v+1);
        }
        return map;
    }

    public void applySpice(Spice spice) {
        spicesAdded.add(spice);
    }

}
