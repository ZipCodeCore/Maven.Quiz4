package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    List<Spice> spiceList;
    public Food(){

        spiceList= new ArrayList<Spice>();
    }
    public List<Spice> getAllSpices() {

        return spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        return null;
    }

    public void applySpice(Spice spice) {
    }
}
