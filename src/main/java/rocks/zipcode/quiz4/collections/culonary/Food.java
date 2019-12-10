package rocks.zipcode.quiz4.collections.culonary;

import com.sun.codemodel.internal.JForEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    List<Spice>spiceList;

    public Food(){
        this.spiceList = new ArrayList<Spice>();
    }

    public List<Spice> getAllSpices() {
        return this.spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
            /*Map<SpiceType,Integer> spiceCount = new HashMap<>();
        for (Spice s: spiceList) {
            if (!spiceCount.containsKey(s)) {
                spiceCount.put(s, 1);
            } else {
                spiceCount.put(s, spiceCount.get(s) + 1);
            }

        }
        return spiceCount;
    }*/
            return null;
    }

    public void applySpice(Spice spice) {
        spiceList.add(spice);
    }
}
