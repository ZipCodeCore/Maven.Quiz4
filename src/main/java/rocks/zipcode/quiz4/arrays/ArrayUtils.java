package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        return null;
    }

    public static String[] removeMiddleElement(String[] values) {
        return null;
    }

    public static String getLastElement(String[] values) {

        return null;
    }

    public static String[] removeLastElement(String[] values) {
        String [] result = new String[values.length-1];

        for (int i = 0; i < result.length; i++){
            result[i] = values[i];
        }
        return result;
    }
}