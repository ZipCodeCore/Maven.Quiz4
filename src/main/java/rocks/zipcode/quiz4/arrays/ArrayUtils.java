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
//        ArrayList<String> outputArray = new ArrayList<String>();
//
//        int midEl = values.length / 2;
//        int midElMinusOne = values.length / 2 - 1;
//        for (int i = 0; i < values.length; i++) {
//            outputArray.add(values[i]);
//        }
//        outputArray.remove(midEl);
//        outputArray.remove(midElMinusOne);
//
//        String[] newStr = new String[outputArray];
//        return newStr;
//        String[] newArr = Arrays.copyOf(values, values.length-1);
        return null;
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