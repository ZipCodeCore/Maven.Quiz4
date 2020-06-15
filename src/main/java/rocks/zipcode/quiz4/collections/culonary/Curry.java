package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.List;

public class Curry implements Spice {

    private List<Spice> spiceList=new ArrayList<>();

    public List<Spice> getSpiceList() {
        return spiceList;
    }

    public void setSpiceList(List<Spice> spiceList) {
        this.spiceList = spiceList;
    }




}
