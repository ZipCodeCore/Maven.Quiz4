package rocks.zipcode.quiz4.collections.culonary;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    List<Spice> mySpices = new ArrayList<>();
    Set<Spice> spicesSet;


    public List<Spice> getAllSpices() {
        return mySpices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        //Map<SpiceType, Long> spiceMap = mySpices.stream().collect(Collectors.toMap((Spice)Collectors.groupingBy(Function.identity()), Collectors.counting()));

        Map<SpiceType, Integer> spiceMap = new HashMap<>();
        for (Spice spice: mySpices) {
            SpiceType spiceType = (SpiceType) spice.getClass();
            if(spiceMap.containsKey(spiceType)){
                spiceMap.put(spiceType, spiceMap.get(spiceType) + 1);
            }
            else {
                spiceMap.put(spiceType, 1);
            }
        }
        return spiceMap;
    }

    //    HashMap<String,int> frequencymap = new HashMap<String,int>();
//    foreach(String a in animals) {
//        if(frequencymap.containsKey(a)) {
//            frequencymap.put(a, frequencymap.get(a)+1);
//        }
//        else{ frequencymap.put(a, 1); }
//    }


    public void applySpice(Spice spice) {
        mySpices.add(spice);
        //spicesSet = new HashSet(mySpices);
    }
}
