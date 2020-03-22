package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    Map<Class<? extends Spice>, Integer> map;
    List<Spice> l;

    public Food(){
        map = new HashMap<>();
        l = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return l;
    }

    public Map<Class<? extends Spice>, Integer> getSpiceCount() {
        return map;
    }

    public void applySpice(Spice spice) {
        l.add(spice);
        if(map.containsKey(spice.getClass())) {
            map.replace(spice.getClass(), map.get(spice.getClass()) + 1);
        }else {
            map.put(spice.getClass(), 1);
        }
    }
}
