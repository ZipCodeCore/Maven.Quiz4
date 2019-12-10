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
        List<String> newArray = new ArrayList<>(Arrays.asList(values));
        newArray.remove(getMiddleElement(values));
        return newArray.toArray(new String[0]);
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        List<String> newArray = new ArrayList<>(Arrays.asList(values));
        newArray.remove(getLastElement(values));
        return newArray.toArray(new String[0]);
    }
}