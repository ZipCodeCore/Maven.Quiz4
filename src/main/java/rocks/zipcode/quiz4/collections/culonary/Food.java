package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private List<Spice> spiceList = new ArrayList<>();

    public List<Spice> getAllSpices() {
        return spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> map = new HashMap<>();
        for(Spice spice : spiceList){

            if(map.get(spice.getClass()) != null){
                SpiceType key = (SpiceType)spice.getClass();
                Integer value = map.get(spice.getClass());
                value++;
                map.replace(key, value);
            }else{
                SpiceType key = (SpiceType)spice.getClass();
                map.put(key, 1);
            }
        }
        return map;
    }

    public void applySpice(Spice spice) {
        spiceList.add(spice);
    }
}
