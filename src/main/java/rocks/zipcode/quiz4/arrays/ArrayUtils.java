package rocks.zipcode.quiz4.arrays;

import rocks.zipcode.quiz4.fundamentals.StringUtils;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        List<String> list = new ArrayList<>(Arrays.asList(values));
        list.remove(list.size()/2);
       return listToStringArr(list);
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        Deque<String> list = new ArrayDeque<>(Arrays.asList(values));
        list.removeLast();
        String[] result = new String[list.size()];
        result = list.toArray(result);
        return result;
    }

    public static String[] listToStringArr(List<String> list){
        String[] result = new String[list.size()];
        result = list.toArray(result);
        return result;
    }

}