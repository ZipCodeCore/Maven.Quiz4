package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> allSpices;

    public Food(){
        this.allSpices = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return this.allSpices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> spiceCountMap = new HashMap<>();

        spiceCountMap.put((SpiceType) allSpices.get(0).getClass(), allSpices.size());
        return spiceCountMap;
    }

    public void applySpice(Spice spice) {
        allSpices.add(spice);
    }
}
