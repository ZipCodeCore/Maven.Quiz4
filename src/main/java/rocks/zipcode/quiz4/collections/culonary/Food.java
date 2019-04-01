package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spices;

    public Food(List<Spice> spices){
        this.spices = spices;
    }

    public Food(){
        this.spices = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return this.spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> spiceCount = new HashMap<>();
        for (Spice spice : spices){
            if (!spiceCount.containsKey((SpiceType) spice.getClass())){
                spiceCount.put((SpiceType) spice.getClass(), 1);
            } else {
                Integer count = spiceCount.get((SpiceType) spice.getClass());
                spiceCount.put((SpiceType) spice.getClass(), count + 1);
            }
        }
        return spiceCount;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
