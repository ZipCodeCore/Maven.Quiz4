package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        List<String> l = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(values, 0, values.length / 2)));
        l.addAll(Arrays.asList(Arrays.copyOfRange(values, values.length/2+1, values.length)));

        return l.toArray(new String[l.size()]);
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOfRange(values,0,values.length - 1);
    }
}