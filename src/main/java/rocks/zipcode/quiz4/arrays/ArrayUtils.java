package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int middleIndex = (int) (values.length / 2);
        String middle = values[middleIndex];

        return middle;

    }

    public static String[] removeMiddleElement(String[] values) {
        String middle = ArrayUtils.getMiddleElement(values);
        List<String> al = new ArrayList<String>(Arrays.asList(values));

        List<String> newList = al.stream().filter(x -> !x.equals(middle)).collect(Collectors.toList());
        String[] result = new String[newList.size()];
        newList.toArray(result);
        return result;

    }

    public static String getLastElement(String[] values) {
        String result = values[values.length - 1];

        return result;
    }

    public static String[] removeLastElement(String[] values) {
        String last = getLastElement(values);
        ArrayList<String> al = new ArrayList<>(Arrays.asList(values));
        List<String> newList = al.stream().filter(x -> !x.equals(last)).collect(Collectors.toList());
        String[] result = new String[newList.size()];
        newList.toArray(result);
        return result;
    }
}