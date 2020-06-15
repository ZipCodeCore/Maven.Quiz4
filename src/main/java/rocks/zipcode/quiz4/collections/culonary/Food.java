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

    public Food() {
        spices = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {
        return spices;
    }


    public <SpiceType  extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> count = new HashMap<>();

        for (Spice s: spices) {
            if(count.containsKey((SpiceType)s.getClass())){
            count.put((SpiceType)s.getClass(),count.get(s.getClass())+1);
            }
        else count.put((SpiceType)s.getClass(),1);

//            count.put(, count.get(s) + 1);
        }return count;
    }



    public void applySpice(Spice spice) {
        spices.add(spice);



    }
}
