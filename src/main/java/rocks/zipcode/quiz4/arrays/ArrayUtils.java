package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {


       String middle = values[values.length/2];

        return middle;
    }

    public static String[] removeMiddleElement(String[] values)

    {
        String element = getMiddleElement(values);

        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(values));
        arrList.remove(element);


        String [] n = new String[values.length - 1];
        arrList.toArray(n);

        return n;
    }

    public static String getLastElement(String[] values)
    {


        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {

       String lastElement = getLastElement(values);

        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(values));
        arrList.remove(values.length-1);


        String [] n = new String[values.length - 1];
        arrList.toArray(n);

        return n;


    }
}