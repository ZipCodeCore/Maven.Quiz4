package rocks.zipcode.quiz4.arrays;

import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] firstHalf = Arrays.copyOfRange(values,0,values.length/2);
        String[] secondHalf = Arrays.copyOfRange(values, (values.length/2)+1, values.length);
        String[] noMiddle = Arrays.copyOf(firstHalf,values.length-1);
        System.arraycopy(secondHalf,0,noMiddle,firstHalf.length, secondHalf.length);
        return noMiddle;
    }

    public static String getLastElement(String[] values) {

        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] noLastElement = Arrays.copyOfRange(values,0,values.length-1);


        return noLastElement;
    }
}