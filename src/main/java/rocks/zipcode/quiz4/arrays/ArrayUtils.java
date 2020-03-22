package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
//        ArrayList<String> a = new ArrayList<>( Arrays.asList(values));
//        a.remove(a.size()/2);
//        return a.toArray(new String[0]);
        String[] arr = new String [values.length-1];
        for (int i = 0; i < values.length-1 ; i++) {
            if(i<values.length/2)
                arr[i] = values[i];
            else
                arr[i] = values[i+1];
        }
        return arr;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] arr = new String [values.length-1];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = values[i];
        }
        return arr;
    }
}