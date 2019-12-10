package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {

    //pass
    public static String getMiddleElement(String[] values) {

        int half = values.length / 2;

        return values[half];
    }
    //pass
    public static String[] removeMiddleElement(String[] values) {

        int half = values.length / 2;
        int count = 0;

        String[] result = new String[values.length -1];

        for (int i = 0; i < values.length; i++){

            if ( values[i] != values[half]){
                result[count] = values[i];
                count++;
            }
        }
        return result;
    }
    //pass
    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }
    //pass
    public static String[] removeLastElement(String[] values) {
        int last = values.length - 1;
        int count = 0;

        String[] result = new String[values.length -1];

        for (int i = 0; i < last; i++){

                result[count] = values[i];
                count++;

        }
        return result;
    }
}