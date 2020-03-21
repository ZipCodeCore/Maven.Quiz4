package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] firstHalf= Arrays.copyOf(values, values.length/2);
        String[] secondHalf = Arrays.copyOfRange(values, values.length/2+1, values.length);
        return Stream.concat(Arrays.stream(firstHalf), Arrays.stream(secondHalf)).toArray(String[]::new);
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOfRange(values,0,values.length-1);
    }
}