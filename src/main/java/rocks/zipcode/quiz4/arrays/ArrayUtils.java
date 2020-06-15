package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        int middle = values.length/2;
        return values[middle];
    }

    public static String[] removeMiddleElement(String[] values) {
       int middle = values.length/2;
        String[] str_array = values;
        List<String> list = new ArrayList<String>(Arrays.asList(str_array));
        list.remove(middle);
        str_array = list.toArray(new String[0]);
        return str_array;
    }

    public static String getLastElement(String[] values) {

        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {

        String[] str_array = values;
        List<String> list = new ArrayList<String>(Arrays.asList(str_array));
        list.remove(values.length-1);
        str_array = list.toArray(new String[0]);

        return str_array;
    }
}