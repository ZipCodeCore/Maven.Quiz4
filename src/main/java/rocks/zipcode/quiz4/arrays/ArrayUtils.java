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
        String[] newValues = new String[values.length - 1];
        int middle = values.length / 2;
        int index = 0;
        for (int i = 0; i < values.length; i++) {
            if (i != middle) {
                newValues[index] = values[i];
                index++;

            }

        }return newValues;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {

        return Arrays.copyOfRange(values,0,values.length-1);
    }
}