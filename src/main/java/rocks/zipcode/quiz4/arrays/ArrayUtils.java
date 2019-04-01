package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        return removeElement(values, values.length/2);
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        return removeElement(values, values.length - 1);
    }

    private static String[] removeElement(String[] values, int indexToRemove) {
        String[] result = new String[values.length - 1];

        for (int i = 0, j = 0; i < values.length; i++, j++) {
            if (i != indexToRemove) {
                result[j] = values[i];
            } else {
                j--;
            }
        }

        return result;
    }
}