package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        String str = values[values.length / 2];

        return str;
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] arr = new String[values.length-1];
        int j = values.length/2;
        for (int i = 0; i < values.length; i++)    {
            if(i < j)   {
                arr[i] = values[i];
            }   if(i > j)   {
                arr[i-1] = values[i];
            }
        }
        return arr;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] arr = new String[values.length-1];
        for(int i = 0; i < arr.length; i++)  {
            arr[i] = values[i];
        }
        return arr;
    }
}