package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spices = new ArrayList<>();

    public List<Spice> getAllSpices() {
        return this.spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> result = new HashMap<>();

        for(Spice s: spices){
            Integer count = 1;
            if(result.containsKey((SpiceType) s.getClass())){
                count = result.get((SpiceType) s.getClass());
                count++;
            }
            result.put((SpiceType) s.getClass(), count);
        }
        return result;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
