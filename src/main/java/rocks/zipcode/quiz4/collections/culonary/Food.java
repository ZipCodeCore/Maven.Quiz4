package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author leon on 27/12/2018.
 */
public class Food implements Spice{

    List<Spice> list = new ArrayList<>();

    public Food() {
    }

    public List<Spice> getAllSpices() {
        return list;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {


        System.out.println(list);

        Map<Object, Integer> xx = list.stream()
                .collect(Collectors.toMap(s -> s.getClass(), s -> 1, Integer::sum));

        System.out.println(xx);

        System.out.println(xx.keySet().iterator().next() );


        Map<SpiceType, Integer> res = null;
        res.put((SpiceType) xx.keySet().iterator().next(), 5);
        System.out.println(res.get(0).getClass());
        return res;
    }

    public void applySpice(Spice spice) {
        list.add(spice);
    }
}
