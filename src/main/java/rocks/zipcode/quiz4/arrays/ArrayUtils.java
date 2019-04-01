package rocks.zipcode.quiz4.arrays;

import rocks.zipcode.quiz4.fundamentals.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        Integer length = values.length;
        if(length % 2 == 1) {
            length = length/2;
        }
        else {
            length = (length/2) -1;
        }
        return values[length];
    }

    public static String[] removeMiddleElement(String[] values) {
        String middleElement = getMiddleElement(values);
        List<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < values.length ; i++) {
            if(values[i] != middleElement) {
                stringArrayList.add(values[i]);
            }
        }
        String[] stringArray = stringArrayList.stream().toArray(String[]::new);
        return stringArray;
    }

    public static String getLastElement(String[] values) {
        Integer lastElement = values.length -1;
        return values[lastElement];
    }

    public static String[] removeLastElement(String[] values) {
        String[] newArray = new String[values.length -1];
        for (int i = 0; i < values.length-1 ; i++) {
            newArray[i] = values[i];
        }
        return newArray;
    }
}