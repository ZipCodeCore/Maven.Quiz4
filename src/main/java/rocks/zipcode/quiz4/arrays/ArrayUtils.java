package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        String[] middleElement = new String[1];
        if (values.length % 2 != 0) {

            middleElement[0] = values[values.length / 2];
        }
        return Arrays.toString(middleElement);
    }

    public static String[] removeMiddleElement(String[] values) {
        return null;
    }

    public static String getLastElement(String[] values) {

        return null;
    }

    public static String[] removeLastElement(String[] values) {
        String[] valueRemoved = new String[values.length-1];
        
        return null;
    }
}