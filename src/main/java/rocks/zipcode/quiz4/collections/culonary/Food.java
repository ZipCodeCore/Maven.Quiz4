package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spices;

    public Food() {
        this.spices = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
//        spices.stream().collect(Collectors.groupingBy(Spice::getClass),Collectors.counting());
        return null;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
