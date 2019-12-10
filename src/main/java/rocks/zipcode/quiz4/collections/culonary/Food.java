package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    List<Spice> spices;

    public Food(){
        this.spices = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType,Integer> map = new HashMap<>();

        for(Spice s: spices){
            Integer count = 0;
            for (Spice spice : spices) {
                if (spice.equals(s)) {
                    count++;
                }
            }

            //map.put(s,count);
        }
        return map;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
