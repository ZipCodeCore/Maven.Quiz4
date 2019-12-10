package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        Integer size = values.length;
        Integer index = size/2;
        return values[index];
    }

    public static String[] removeMiddleElement(String[] values) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : values) {
            if (!values.equals(getMiddleElement(values))) {
                result.add(s);
            }
        }
        String[] output = new String[result.size()];
        output = result.toArray(output);
        return output;
    }

    public static String getLastElement(String[] values) {
        Integer size = values.length;
        return values[size-1];
    }

    public static String[] removeLastElement(String[] values) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : values) {
            if (!s.equals(getLastElement(values))) {
                result.add(s);
            }
        }
        String[] output = new String[result.size()];
        output = result.toArray(output);
        return output;
    }
}