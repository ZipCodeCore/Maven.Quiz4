package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        return values[(values.length-1)/2];
    }

    public static String[] removeMiddleElement(String[] values) {

        ArrayList<String> tempArrayList = new ArrayList<>();
        for(int i = 0; i<values.length;i++){
            if(values[i] != getMiddleElement(values)){
                tempArrayList.add(values[i]);
            }

        }

        String[] retVal = new String[tempArrayList.size()];
        retVal = tempArrayList.toArray(retVal);

        return retVal;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        ArrayList<String> tempArrayList= new ArrayList<>();

        for(int i =0; i< values.length-1; i++){
            tempArrayList.add(values[i]);
        }

        String[] retVal = new String[tempArrayList.size()];
        retVal = tempArrayList.toArray(retVal);

        return retVal;
    }
}