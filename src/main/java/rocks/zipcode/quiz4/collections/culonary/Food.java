package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    List<Spice> spices;

    public Food() {
        spices = new LinkedList<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> retMap = new LinkedHashMap<>();
        Stream.of(spices)
                .flatMap(Collection::stream)
                .forEach(x -> {
                    retMap.compute((SpiceType)x.getClass(), (k,v) -> (v == null) ? 1 : v + 1);
                });

        return retMap;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
