package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        Integer midIndex = values.length / 2;
        return values[midIndex];
    }

    public static String[] removeMiddleElement(String[] values) {
        ArrayList<String> valuesList= new ArrayList<>(Arrays.asList(values));
        valuesList.remove((values.length)/2);
        String [] result = new String[valuesList.size()];
        result = valuesList.toArray(result);
        return result;
    }

    public static String getLastElement(String[] values) {
        Integer lastIndex = values.length -1;
        return values[lastIndex];
    }

    public static String[] removeLastElement(String[] values) {
        ArrayList<String> valuesList = new ArrayList<>(Arrays.asList(values));
        //Integer lastIndex = values.length -1;
        valuesList.remove(values.length - 1);
        String [] result = new String[valuesList.size()];
        result = valuesList.toArray(result);
        return result;
    }
}