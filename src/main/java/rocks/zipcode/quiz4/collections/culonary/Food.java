package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spices;


    public Food(){
        spices = new ArrayList<>();

    }

    public List<Spice> getAllSpices() {

        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> spiceMap = new HashMap<>();
        spices.forEach(s -> spiceMap.compute((SpiceType) s.getClass(), (k, v) -> (v == null) ? 1 : v + 1));
        return spiceMap;
    }



    public void applySpice(Spice spice) {
        spices.add(spice);


    }


}
