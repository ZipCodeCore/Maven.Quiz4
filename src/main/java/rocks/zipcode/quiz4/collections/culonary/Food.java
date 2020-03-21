package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spiceList;

    public Food() {
        this.spiceList = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType,Integer> spiceTypeIntegerMap = new HashMap<>();

        spiceList.forEach(spice -> spiceTypeIntegerMap.putIfAbsent((SpiceType) spice.getClass(),0));
        spiceList.forEach(spice -> spiceTypeIntegerMap.put((SpiceType) spice.getClass(),spiceTypeIntegerMap.get(spice.getClass())+1));

        return spiceTypeIntegerMap;
    }

    public void applySpice(Spice spice) {
        spiceList.add(spice);
    }
}
