package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private List<Spice> list;

    public Food(){
        this.list = new ArrayList<>();
    }
    public List<Spice> getAllSpices() {
        return list;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> result = new HashMap<>();
        for(Spice each : list){
            SpiceType spiceType = (SpiceType) each.getClass();
            if(result.containsKey(spiceType)){
                Integer value = result.get(spiceType);
                result.put(spiceType, value+1);
            }else{
                result.put(spiceType, 1);
            }
        }
        return result;
    }

    public void applySpice(Spice spice) {
        this.list.add(spice);
    }
}
