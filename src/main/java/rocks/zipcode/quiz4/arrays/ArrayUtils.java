package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int middle = values.length/2;
        return values[middle];
    }

    public static String[] removeMiddleElement(String[] values) {

        String middleString = getMiddleElement(values);

        List<String> myStringList = Arrays.asList(values);
        List<String> returnStringList= new ArrayList<>();

        for(int i=0;i<myStringList.size();i++){
            if(!(middleString.equalsIgnoreCase(myStringList.get(i))))
            {
                returnStringList.add(myStringList.get(i));
            }
        }

        String []returnArray = (String [])returnStringList.toArray(new String[0]);
        return returnArray;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] newArray = Arrays.copyOf(values, values.length-1);

        return newArray;
    }
}