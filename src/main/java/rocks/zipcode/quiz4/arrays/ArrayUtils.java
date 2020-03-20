package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int mid = values.length / 2;
        return values[mid];
    }

    public static String[] removeMiddleElement(String[] values) {
        int middleStart = (values.length - 1) / 2;
        int middleEnd = (values.length - 1) - middleStart;
        int elementsToRemove = middleEnd - middleStart + 1;

        String[] result = new String[values.length - elementsToRemove];
        System.arraycopy(values, 0, result, 0, middleStart);
        System.arraycopy(values, middleEnd + 1, result, middleStart, middleStart);
        return result;
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOf(values,  values.length - 1);
    }
}