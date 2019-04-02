package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private List<Spice> spices;
    private  Map <Class<? extends Spice>, Integer> spiceMap;

    public Food(){

        this.spices = new ArrayList<>();
        this.spiceMap = new HashMap<>();
    }


    public List<Spice> getAllSpices() {

        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        return (Map<SpiceType, Integer>) spiceMap;
    }


    public void applySpice(Spice spice) {

        Integer value = spiceMap.getOrDefault(spice.getClass(), null);
        value = (value ==null? 1: value+1);
        spiceMap.put(spice.getClass(), value);
        spices.add(spice);
    }
}
