package rocks.zipcode.quiz4.arrays;

import java.util.*;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        int middleIndex = values.length/2;


        return values[middleIndex];
    }

    public static String[] removeMiddleElement(String[] values) {
        List<String> list = new ArrayList<>(Arrays.asList(values));
        list.remove(list.size()/2);
      return list.toArray(new String[0]);
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