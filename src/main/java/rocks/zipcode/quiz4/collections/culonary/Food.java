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
    public List<Spice> getAllSpices() {
        return added;
    }

    public <SpiceType extends Class <? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        HashMap<SpiceType, Integer> spiceMap = new HashMap<>();
        spiceMap.put(, 1);
        return spiceMap;
    }

    public void applySpice(Spice spice) {
        added.add(spice);
    }
}
