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
        Map<SpiceType, Integer> spiceCountMap = new HashMap<>();

        for (int i = 0; i < spices.size(); i++) {
            if (spiceCountMap.containsKey(spices.get(i).getClass())) {
                Integer count = spiceCountMap.get(spices.get(i).getClass());
                spiceCountMap.put((SpiceType) spices.get(i).getClass(), ++count);
            }
            else{
                spiceCountMap.put((SpiceType) spices.get(i).getClass(), 1);
            }
        }
        return spiceCountMap;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
