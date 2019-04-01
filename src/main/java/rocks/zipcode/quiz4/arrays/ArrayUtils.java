package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        int originalLength = values.length;
        String[] copyLeft = Arrays.copyOfRange(values,0,(originalLength/2));
        String[] copyRight = Arrays.copyOfRange(values,(originalLength/2) + 1, originalLength);

        String[] copyTotal = new String[originalLength - 1];

        System.arraycopy(copyLeft, 0, copyTotal, 0, copyLeft.length);
        System.arraycopy(copyRight, 0, copyTotal, copyLeft.length, copyRight.length);

        return copyTotal;
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOf(values,values.length-1);
    }
}