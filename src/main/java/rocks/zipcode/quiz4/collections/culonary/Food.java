package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

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
        return spiceMap;
    }

    public void applySpice(Spice spice) {

        Integer frequency = spiceMap.getOrDefault(spice.getClass(), null);
        frequency = (frequency == null)? 1: frequency+1;
        spiceMap.put(spice.getClass(), frequency);
        spices.add(spice);
    }
//    public void applySpice(Spice spice) {
//        boolean found = false;
//        for(Spice spiceKey : spiceMap.keySet()){
//            if(spiceKey.getName().equals(spice.getName())){
//                spiceMap.put(spiceKey, spiceMap.get(spiceKey) + 1);
//                found = true;
//                break;
//            }
//        }
//        if(found == false){
//            spiceMap.put(spice, 1);
//        }
//    }
}
