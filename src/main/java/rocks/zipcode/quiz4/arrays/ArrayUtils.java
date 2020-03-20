package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int start = 0;
        int end = values.length-1;
        int mid = start + (end - start)/2;

        return values[mid];
    }

    public static String[] removeMiddleElement(String[] values) {
        String remove = getMiddleElement(values);
//        String[] result = new String[values.length- 1];
//        result = values.clone();



        return null;
    }

    public static String getLastElement(String[] values) {

        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {

        return values = Arrays.copyOfRange(values,0,values.length-1);
    }
}