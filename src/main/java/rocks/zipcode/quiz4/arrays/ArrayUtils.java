package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {

        return null;
    }

    public static String getLastElement(String[] values) {

        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {

        String [] last = new String [values.length-1];
        for (int i = 0; i <values.length-1; i++) {
            last[i] = values[i];

        }

        return last;
    }
}