package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    Map<Class<? extends Spice>, Integer> spiceMap;
    List<Spice> spices;

    public Food(){
        this(null);
    }

    public Food(Map<Class<? extends Spice>, Integer> spiceMap) {
        if(spiceMap != null)
            this.spiceMap = spiceMap;
        else
            this.spiceMap = new LinkedHashMap<>();
        spices = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<Class<? extends Spice>, Integer> getSpiceCount() {
    //public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        return spiceMap;
    }

    public void applySpice(Spice spice) {
        Integer frequency = spiceMap.getOrDefault(spice.getClass(), null);
        frequency = (frequency == null)? 1: frequency+1;
        spiceMap.put(spice.getClass(), frequency);
        spices.add(spice);
    }
}
