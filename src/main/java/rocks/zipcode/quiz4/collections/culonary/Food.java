package rocks.zipcode.quiz4.collections.culonary;

import rocks.zipcode.quiz4.collections.WordCounter;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private Map<Spice, Integer> spiceIntegerMap;

    public Food() {
        this.spiceIntegerMap = new LinkedHashMap<>();
    }

    public Food(List<Spice> spices) {
        this();
        getSpiceFrequencies(spices);
    }

    private void getSpiceFrequencies(List<Spice> spices) {
        spices.forEach(this::applySpice);
    }

    public List<Spice> getAllSpices() {
        return new ArrayList<>(spiceIntegerMap.keySet());
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        return mapTypes();
    }

    private <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> mapTypes() {
        Map<SpiceType, Integer> spiceTypeIntegerMap = new HashMap<>();
        spiceIntegerMap.keySet().forEach(spice -> WordCounter.putInMap(spiceTypeIntegerMap, (SpiceType) spice.getClass()));
        return spiceTypeIntegerMap;
    }

    public void applySpice(Spice spice) {
        WordCounter.putInMap(spiceIntegerMap, spice);
    }
}
