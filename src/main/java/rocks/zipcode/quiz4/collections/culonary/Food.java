package rocks.zipcode.quiz4.collections.culonary;

import rocks.zipcode.quiz4.collections.WordCounter;

import java.util.*;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> spices = new ArrayList<>();

    public List<Spice> getAllSpices() {

        return this.spices;
    }

   public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        Map<SpiceType, Integer> retVal = new HashMap<>();

        for(Spice s: spices){
             Integer counter = 1;
             if(retVal.containsKey((SpiceType) s.getClass())){
                 counter = retVal.get((SpiceType) s.getClass());
                 counter++;
             }
            retVal.put((SpiceType) s.getClass(), counter);
        }

        return retVal;

    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
