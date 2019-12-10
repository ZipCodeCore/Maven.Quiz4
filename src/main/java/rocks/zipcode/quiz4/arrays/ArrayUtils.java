package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[middleIndex(values.length)];
    }

    public static String[] removeMiddleElement(String[] values) {
        int idx = middleIndex(values.length);
        String[] out = new String[values.length-1];
        for (int i = 0; i < values.length; i++) {
            if (i < idx) out[i] = values[i];
            else if (i > idx) out[i-1] = values[i];
        }
        return out;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] out = new String[values.length-1];
        for (int i = 0; i < out.length; i++) out[i] = values[i];
        return out;
    }

    public static Integer middleIndex(Integer len) {
        return (len - (len % 2)) / 2;
    }
}