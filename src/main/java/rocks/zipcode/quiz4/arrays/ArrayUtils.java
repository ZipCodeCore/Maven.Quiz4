package rocks.zipcode.quiz4.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        ArrayList<String> result = new ArrayList<>(Arrays.asList(values));
        result.remove(result.size()/2);

        return result.toArray(new String[0]);
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        ArrayList<String> result = new ArrayList<>(Arrays.asList(values));
        result.remove(result.size()-1);

        return result.toArray(new String[0]);
    }
}