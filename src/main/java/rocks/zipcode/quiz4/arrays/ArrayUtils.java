package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] newArray = new String[values.length-1];
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] != getMiddleElement(values)){
                newArray[count] = values[i];
                count++;
            }
        }
        return newArray;
    }

    public static String getLastElement(String[] values) {

        return values[values.length -1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] newArray = new String[values.length -1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = values[i];
        }
        return newArray;
    }
}