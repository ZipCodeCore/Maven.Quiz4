package rocks.zipcode.quiz4.arrays;
import java.util.*;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {


    public static String getMiddleElement(String[] values) {

        if (values.length / 2 == 0) {
            return values[values.length / 2];
        } else {
            return values[(values.length-1) / 2];
        }
    }

    public static String[] removeMiddleElement(String[] values) {

        String[] newArray = new String[values.length - 1];
        for(int i = 0; i < values.length; i++){
            if(i < values.length / 2){
                newArray[i] = values[i];
            }
            if(i > values.length / 2){
                newArray[i - 1] = values[i];
            }
        }
        return newArray;
    }

    public static String getLastElement(String[] values) {

        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {

        String[] newArray = new ArrayList<String>().toArray(new String[0]);
        newArray = Arrays.copyOf(values, values.length-1);
        return newArray;
    }
}