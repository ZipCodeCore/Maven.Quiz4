package rocks.zipcode.quiz4.collections.culonary;

import rocks.zipcode.quiz4.collections.WordCounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spices;
    private Map<Class<? extends Spice>,Integer> spiceMap;

    public Food() {
        this.spices = new ArrayList<>();
        this.spiceMap = new HashMap<>();

    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);

        if(!spiceMap.containsKey(spice.getClass())){
            spiceMap.put(spice.getClass(),1);
        }else{
            Integer newValue = spiceMap.get(spice.getClass());
            spiceMap.put(spice.getClass(),newValue +1);
        }

    }

    public Map<Class<? extends Spice>, Integer> getSpiceCount() {
        return spiceMap;
    }
}
