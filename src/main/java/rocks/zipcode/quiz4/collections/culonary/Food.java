package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    ArrayList<Spice> added;

    public Food(){
        this.added = new ArrayList<Spice>();

    }
    public List getAllSpices() {
        return added;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        HashMap<SpiceType, Integer> spiceMap = new HashMap<>();
        for(Spice currentSpice : added){
    //achieved casting w/ help from classmate
            SpiceType spice = (SpiceType)currentSpice.getClass();
            spiceMap.put(spice,added.size());
        }
        System.out.println(spiceMap.keySet());

        return spiceMap;
    }

    public void applySpice(Spice spice) {
        added.add(spice);
    }
}
