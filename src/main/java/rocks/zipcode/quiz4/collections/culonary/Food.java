package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    public List<Spice> listOfSpices;

    public Food() {
        this.listOfSpices = new ArrayList<>();
    }

    public Food(List<Spice> spices) {
        this.listOfSpices = spices;
    }
    public List<Spice> getAllSpices() {
        return listOfSpices;
    }

    public Map<Class<? extends Spice>, Integer> getSpiceCount() {
        Map<Class<? extends Spice>,Integer> spiceMap = new HashMap<>();
        for (Spice spice: listOfSpices) {
            if(spiceMap.get(spice.getClass()) == null) {
                spiceMap.put(spice.getClass(),1);
            }
            else {
                Integer count = spiceMap.get(spice.getClass());
                count += 1;
                spiceMap.put(spice.getClass(),count);
            }
        }
        return spiceMap;
    }

//    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
//        Map<SpiceType,Integer> spiceMap = new HashMap<>();
//        for (Spice spice: listOfSpices) {
//            if(spiceMap.get(spice) == null) {
//            }
//        }
//        return null;
//    }

    public void applySpice(Spice spice) {
        listOfSpices.add(spice);
    }
}
