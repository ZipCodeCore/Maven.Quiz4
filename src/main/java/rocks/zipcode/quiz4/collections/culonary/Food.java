package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    List<Spice> spices;

    public List<Spice> getAllSpices() {
        this.spices = new ArrayList<>();

        spices = new ArrayList<>();
        List spices1 = new ArrayList<>();
        for(Spice s:spices){
            s.getName();
        }
        return spices1 ;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> count = new HashMap<>();
//        for(Spice s: spices){
//        count.put(s,count.get(s)+1);
        return count;
    }

    public void applySpice(Spice spice) {
        spice.getName();



    }
}
