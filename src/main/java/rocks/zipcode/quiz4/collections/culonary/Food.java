package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    private Curry curry;

    public Curry getCurry() {
        return curry;
    }

    public void setCurry(Curry curry) {
        this.curry = curry;
    }

    public List<Spice> getSpiceList() {
        return spiceList;
    }

    public void setSpiceList(List<Spice> spiceList) {
        this.spiceList = spiceList;
    }

    private List<Spice> spiceList=new ArrayList<>();

    public List<Spice> getAllSpices() {

        return spiceList;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount()
    {
        Map<SpiceType, Integer> map =new TreeMap<SpiceType, Integer>();

        curry=new Curry();
        curry.getSpiceList();

        return null;
    }

    public void applySpice(Spice spice) {
    }
}
