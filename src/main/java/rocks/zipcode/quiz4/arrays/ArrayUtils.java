package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        Integer cnt = 0;
        String[] result = new String[values.length-1];
        values[values.length/2] = null;
        for (int i = 0; i <values.length ; i++) {
            if (values[i] != null){
                result[cnt]=values[i];
                cnt++;
            }
        }
        return result;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] result = new String[values.length-1];
        values[values.length-1] = null;
        for (int i = 0; i <values.length ; i++) {
            if (values[i] != null){
                result[i]=values[i];
            }
        }
        return result;
    }
}