package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food <Spice> {



    List<Spice> myList = new ArrayList<>();





    public List<Spice> getAllSpices() {

        Spice spice = null;

        List<Spice> newList = new ArrayList<>();

        for (int i=0; i<myList.size();i++){

            spice = myList.get(i);

            newList.add(spice);

        }




        return newList;

    }



    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {



        Map<Spice, Integer> map = new HashMap<Spice, Integer>();


        for ( Spice s: myList) {



            if (!map.containsKey(s)) {  // first time we've seen this string
                map.put(s, 1);
            }
            else {
                int count = map.get(s);
                map.put(s, count + 1);
            }
        }
        return (Map<SpiceType, Integer>) map;
    }


    public void applySpice(Spice spice) {



      myList.add(spice);


    }
}
