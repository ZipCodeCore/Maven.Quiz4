package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    List<Spice> list = new ArrayList<>();

    public Food() {
    }

    public List<Spice> getAllSpices() {
        return list;
    }

    public Map<Class<? extends Spice>, Integer> getSpiceCount() {

        return list
                .stream()
                .collect(Collectors.toMap(
                        Spice::getClass,
                        s -> 1,
                        (oldValue,newValue) -> (oldValue + newValue)));
    }

    public void applySpice(Spice spice) {
        list.add(spice);
    }
}
