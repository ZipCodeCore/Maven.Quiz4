package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < values.length; i++){
            if (i != values.length / 2){
                list.add(values[i]);
            }
        }
        String[] output = new String[list.size()];
        return list.toArray(output);
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] output = new String[values.length - 1];
        for (int i = 0; i < values.length - 1; i++){
            output[i] = values[i];
        }
        return output;
    }
}