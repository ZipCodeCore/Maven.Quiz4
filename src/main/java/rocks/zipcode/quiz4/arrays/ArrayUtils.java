package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {

        Integer middleElement = values.length / 2;

        return IntStream
                .range(0,values.length)
                .filter( i -> i != middleElement)
                .mapToObj( i -> values[i] )
                .toArray(String[]::new);
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOf(values,values.length-1);
    }
}