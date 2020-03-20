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
        Map<SpiceType, Integer> output = new HashMap<>();

        for(Spice s: spices){
            int counter = 1;
            if(output.containsKey(s.getClass())){
                counter = output.get(s.getClass());
                counter++;
            }
            output.put((SpiceType) s.getClass(), counter);
        }
        return output;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
