package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] removed = new String[values.length - 1];
        int removeIndex = values.length / 2;

        for (int i = 0, k = 0; i < values.length; i++) {

            if (i == removeIndex) {
                continue;
            }

            removed[k++] = values[i];
        }

        return removed;
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] removed = new String[values.length - 1];
        int removeIndex = values.length - 1;

        for (int i = 0, k = 0; i < values.length; i++) {

            if (i == removeIndex) {
                continue;
            }

            removed[k++] = values[i];
        }

        return removed;
    }

}