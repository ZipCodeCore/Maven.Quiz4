package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private List<Spice> spicesApplied;

    public Food() {
        this.spicesApplied = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spicesApplied;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        Map<Class<? extends Spice>, Integer> spiceMap = new HashMap<>();
        for (Spice spice : spicesApplied) {
            Class<? extends Spice> spiceClass = null;
            try {
                spiceClass = (Class<? extends Spice>) Class.forName("rocks.zipcode.quiz4.collections.culonary." + spice.getName());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (spiceMap.keySet().contains(spiceClass)) {
                spiceMap.put(spiceClass, spiceMap.get(spiceClass) + 1);
            } else {
                spiceMap.put(spiceClass, 1);
            }
        }

        return (Map<SpiceType, Integer>) spiceMap;
    }

    public void applySpice(Spice spice) {
        spicesApplied.add(spice);
    }
}
