package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private List<Spice> spices;

    public Food() {
        this.spices = new ArrayList<>();
    }


    public List<Spice > getAllSpices() {
        return spices;
    }

   public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        Map<SpiceType, Integer> spiceMap = new TreeMap<>();

//    spices.stream().forEach((SpiceType)s ->spiceMap.put((SpiceType) s,spiceMap.get(SpiceType)+1) );


        return spiceMap;
    }

    public void applySpice(Spice spice) {

        spices.add(spice);
    }
}
