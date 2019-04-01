package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String middle = getMiddleElement(values);
        List<String> list = Arrays.stream(values)
                .filter(value -> !value.equals(middle))
                .collect(Collectors.toList());

        return list.toArray(new String[list.size()]);
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOf(values, values.length - 1);
    }
}