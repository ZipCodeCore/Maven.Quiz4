package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] arr = new String[values.length - 1];
        for (int i = 0; i < values.length / 2; i++) {
            arr[i] = values[i];
        }
        for (int i = values.length / 2; i < arr.length; i++) {
            arr[i] = values[i + 1];
        }
        return arr;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        return values = Arrays.copyOfRange(values, 0,values.length-1);
    }
}