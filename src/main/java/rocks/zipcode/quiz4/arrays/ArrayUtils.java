package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        if (values.length - 1 - values.length / 2 >= 0)
            System.arraycopy(values, values.length / 2 + 1, values, values.length / 2, values.length - 1 - values.length / 2);
        return removeLastElement(values);
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOfRange(values, 0, values.length -1);
    }
}