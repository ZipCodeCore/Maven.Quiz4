package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length /2];
    }

    public static String[] removeMiddleElement(String[] values) {

        ArrayList<String> a = new ArrayList<>(Arrays.asList(values));
        a.remove(getMiddleElement(values));
        values = new String[a.size()];
        a.toArray(values);
        return values;
    }

    public static String getLastElement(String[] values) {

        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        ArrayList<String> a = new ArrayList<>(Arrays.asList(values));
        a.remove(getLastElement(values));
        values = new String[a.size()];
        a.toArray(values);
        return values;
    }
}