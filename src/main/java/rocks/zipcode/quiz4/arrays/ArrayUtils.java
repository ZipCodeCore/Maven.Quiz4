package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];

    }

    public static String[] removeMiddleElement(String[] values) {
        ArrayList<String> sup = new ArrayList<>();
        for (int i = 0; i < values.length; i++){
            if(values[i] != getMiddleElement(values)){
                sup.add(values[i]);
            }
        }
        return sup.toArray(new String[sup.size()]);
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] reduced = Arrays.copyOf(values, values.length - 1);
        return reduced;
    }
}