package rocks.zipcode.quiz4.arrays;

import java.util.stream.Stream;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {

    public static String getMiddleElement(String[] values) {
        return values[values.length / 2];
    }

    public static String[] removeMiddleElement(String[] values) {

//        String[] removeMiddle = new String[values.length - 1];
//        int mid = values.length / 2;
//        for (int i = 0; i < values.length ; i++) {
//            if(i < mid){
//                removeMiddle[i] = values[i];
//            }
//            if(i > mid) {
//                removeMiddle[i-1] = values[i];
//            }
//        }
//
//        return removeMiddle;
        return Stream.of(values)
                .filter(v -> !v.equals(getMiddleElement(values)))
                .toArray(String[]::new);

    }

    public static String getLastElement(String[] values) {
        return values[values.length - 1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] removeLast = new String[values.length-1];
        System.arraycopy(values, 0, removeLast, 0, values.length - 1);
        return removeLast;
    }

    //    arraycopy(Object source_arr, int sourcePos,
//              Object dest_arr, int destPos, int len)
//    Parameters :
//    source_arr : array to be copied from
//    sourcePos : starting position in source array from where to copy
//    dest_arr : array to be copied in
//    destPos : starting position in destination array, where to copy in
//    len : total no. of components to be copied.

}