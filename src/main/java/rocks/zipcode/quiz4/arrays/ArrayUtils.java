package rocks.zipcode.quiz4.arrays;

import java.util.*;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        String result = "";

        // Determine if the array is odd or even
        int value = values.length % 2;

        // Obtain the middle index
        int middleIndex = values.length/2;

        // Adjust for the zero index of arrays
        int evenMid = middleIndex - 1;

        if( value == 0 ){
            // The array is even, so obtain the two middle elements
            result += values[evenMid] + "\n" + values[(evenMid+1)];
        }
        else{
            // The array is odd, so obtain the single middle element
            result += values[middleIndex];
        }

        return result;
    }

    public static String[] removeMiddleElement(String[] values) {

      return null;
    }

    public static String getLastElement(String[] values) {
      String lastElement = values[values.length-1];


        return lastElement;
    }

    public static String[] removeLastElement(String[] values) {
       String[] removeLastElement = Arrays.copyOf(values, values.length - 1);
        return removeLastElement;
    }
}