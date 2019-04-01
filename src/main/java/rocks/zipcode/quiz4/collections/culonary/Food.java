package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food<SpiceType> {
    private List<Spice> spices;
    private Map<SpiceType, Integer> spiceMap;


    public Food() {
        this.spices = new ArrayList<>();
        this.spiceMap = new HashMap<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        return (Map<SpiceType, Integer>) spiceMap;
    }

    public void applySpice(Spice spice) {
    }
}
