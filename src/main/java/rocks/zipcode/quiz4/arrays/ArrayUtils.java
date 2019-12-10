package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int middle = values.length/2;
        return values[middle];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] result = new String[values.length -1];
        String remove = getMiddleElement(values);
        int index = 0;

        for(int i = 0; i < values.length; i++)
            if(!values[i].equals(remove)) {
                result[index] = values[i];
                index++;
            }

        return result;
    }

    public static String getLastElement(String[] values) {
        return values[values.length -1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] result = new String[values.length -1];
        for(int i = 0; i < result.length; i++)
                result[i] = values[i];

        return result;
    }
}