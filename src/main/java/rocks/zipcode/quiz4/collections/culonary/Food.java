package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    List<Spice> spices;
    Map <Class<? extends Spice>, Integer> spiceMap;

    public Food(){
        this(null);
    }

    public Food(Map<Class<? extends Spice>, Integer> spiceMap) {
        if(spiceMap != null)
            this.spiceMap = spiceMap;
        else
            this.spiceMap = new LinkedHashMap<>();
        spices = new ArrayList<>();
    }


    public List<Spice> getAllSpices() {

        return spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {


        return  null;
    }


    public void applySpice(Spice spice) {

        Integer num = spiceMap.getOrDefault(spice.getClass(), null);
        num = (num ==null? 1: num+1);
        spiceMap.put(spice.getClass(), num);
        spices.add(spice);
    }
}
