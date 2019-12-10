package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
/*        String[] newArr = new String[values.length-1];
        int midEl = (values.length -1) / 2  ;

        for (int i = 0; i < values.length-1; i++) {
            if(values[i] != values[midEl]){
                newArr[i] = values[i];
            }
        }
        return newArr;*/
        ArrayList<String> result = new ArrayList<>(Arrays.asList(values));
        result.remove(result.size()/2);
        return result.toArray(new String[0]);
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
//        int removeThis;

//        for (int i = 0; i < values.length; i++) {
        String[] newArr = Arrays.copyOf(values, values.length-1);
        return newArr;
    }
}