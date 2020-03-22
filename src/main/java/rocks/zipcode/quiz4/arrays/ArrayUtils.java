package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int result = values.length / 2;
        return values[result];

    }

    public static String[] removeMiddleElement(String[] values) {
        String[] result = new String[values.length - 1];
        int middle = values.length / 2;
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (i != middle) {
                result[index] = values[i];
                index++;

            }

        }
        return result;
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOf(values,  values.length - 1);
    }
}