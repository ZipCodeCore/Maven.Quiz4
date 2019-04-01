package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {


        return values[(values.length/2)];
    }

    public static String[] removeMiddleElement(String[] values) {

        String [] result;
        int i=0;
        String toRemove= getMiddleElement(values);

         List<String> result1 = Arrays.stream(values).filter(line -> !(toRemove.equals(line))).collect(Collectors.toList());

        return result1.toArray( new String[0]);
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {

        return Arrays.copyOf(values, values.length-1);
    }
}