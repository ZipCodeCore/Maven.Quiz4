package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        ArrayList<String> reducedValues = new ArrayList<>(Arrays.asList(values));
        reducedValues.remove(values.length / 2);
        return reducedValues.toArray(new String[0]);
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        ArrayList<String> reducedValues = new ArrayList<>(Arrays.asList(values));
        reducedValues.remove(values.length - 1);
        return reducedValues.toArray(new String[0]);
    }
}