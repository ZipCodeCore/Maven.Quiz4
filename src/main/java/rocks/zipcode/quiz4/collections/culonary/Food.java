package rocks.zipcode.quiz4.collections.culonary;

import rocks.zipcode.quiz4.collections.WordCounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    List<Spice> spices;


    public Food(){
        spices = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> spiceMap = new HashMap<>();

        for(Spice s : spices)
            if(spiceMap.containsKey(s.getClass())){
                spiceMap.replace((SpiceType) s.getClass(), spiceMap.get(s.getClass()) + 1);
            }else
                spiceMap.put((SpiceType) s.getClass(), 1);

        return spiceMap;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
