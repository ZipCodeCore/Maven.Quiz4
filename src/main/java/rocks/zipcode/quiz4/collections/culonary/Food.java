package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    List<Spice> spices;

    public Food() {
        this.spices = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> result = new HashMap<>();

        for(Spice spice: spices){
            Integer counter = 1;
            if(result.containsKey((SpiceType) spice.getClass())){
                counter = result.get((SpiceType) spice.getClass());
                counter++;
            }
            result.put((SpiceType) spice.getClass(), counter);
        }

        return result;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
