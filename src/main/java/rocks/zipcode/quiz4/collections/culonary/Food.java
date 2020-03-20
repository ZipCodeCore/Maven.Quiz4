package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 27/12/2018.
 */
public class Food <T extends Spice> {
    ArrayList<T> added;

    public Food(){
        this.added = new ArrayList<T>();

    }
    public List<T> getAllSpices() {
        return added;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
//        HashMap<SpiceType, Integer> spiceMap = new HashMap<>();
//        for(SpiceType spice : added){
//            spiceMap.put(spice, Collections.frequency(added, spice));
//
//        }

        return null;
    }

    public void applySpice(T spice) {
        added.add(spice);
    }
}
