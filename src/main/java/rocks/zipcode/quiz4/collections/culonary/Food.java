package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food implements Spice {

    private List<Spice> spicesApplied;

    public Food() {

        this.spicesApplied = new ArrayList<>();
    }

    public List<Spice> getAllSpices() {

        return spicesApplied;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {

        return null;
    }


    public void applySpice(Spice spice) {

        spicesApplied.add(spice);
    }

    @Override
    public String getName() {

        return null;
    }
}