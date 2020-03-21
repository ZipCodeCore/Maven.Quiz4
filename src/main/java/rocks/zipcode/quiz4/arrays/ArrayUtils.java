package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] addElement(String[] arr, String str){
        String[] result = new String[arr.length+1];
        int counter = 0;
        for(String existing : arr){
            result[counter] = existing;
            counter++;
        }
        result[result.length-1] = str;
        return result;
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] answer = new String[0];
        for (int i = 0; i < values.length;i++){
            if (i!= values.length/2){
                answer = addElement(answer,values[i]);
            }
        }
        return answer;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] result = new String[values.length-1];
        for(int i = 0;i<values.length-1;i++){
            result[i] = values[i];
        }
        return result;
    }
}