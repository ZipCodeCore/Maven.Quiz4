package rocks.zipcode.quiz4.arrays;
import java.util.List;
import java.util.ArrayList;
/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[(values.length - 1)/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        List<String> newArrayList = new ArrayList<>();
       for(int i = 0; i < values.length; i++) {
           if(values[i] != getMiddleElement(values)) {
               newArrayList.add(values[i]);
           }
       }
        String[] result = new String[newArrayList.size()];
       result = newArrayList.toArray(result);
        return result;
    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        List<String> newArrayList = new ArrayList<>();
        for(int i = 0; i < values.length - 1; i++) {
            newArrayList.add(values[i]);
        }
        String[] result = new String[newArrayList.size()];
        result = newArrayList.toArray(result);
        return result;
    }
}