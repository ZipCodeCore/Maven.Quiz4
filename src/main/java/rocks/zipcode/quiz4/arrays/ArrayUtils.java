package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int counter = 0;
        for (String item : values){
            counter++;
        }
        return values[counter/2];
    }

    public static Integer getIndexOfElement(String stringToFind, String[] arrays){
        for (int i = 0; i < arrays.length; i++)
            if (stringToFind.equals(arrays[i]))
                return i;
        return -1;
    }
    
    public static String[] removeMiddleElement(String[] values) {
        int index = getIndexOfElement(getMiddleElement(values), values);
        ArrayList<String> list = new ArrayList<>(Arrays.asList(values));
        list.remove(index);
        return list.toArray(new String[list.size()]);
    }

    public static String getLastElement(String[] values) {
        int counter = 0;
        for (String item : values){
            counter++;
        }
        return values[counter - 1];
    }

    public static String[] removeLastElement(String[] values) {
        int index = getIndexOfElement(getLastElement(values), values);
        ArrayList<String> list = new ArrayList<>(Arrays.asList(values));
        list.remove(index);
        return list.toArray(new String[list.size()]);
    }
}