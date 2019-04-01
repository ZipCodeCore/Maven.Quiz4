package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        Integer midIndex = values.length / 2;
        return values[midIndex];
    }

    public static String[] removeMiddleElement(String[] values) {
        List<String> list = new ArrayList<>(Arrays.asList(values));
        int midIndex = list.size() / 2;

        list.remove(midIndex);

        return list.toArray(new String[list.size()]);
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        List<String> list = new ArrayList<>(Arrays.asList(values));
        int index = list.size() - 1;

        list.remove(index);

        return list.toArray(new String[list.size()]);
    }
}