package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int len = values.length;
        return values[len/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] newArray = new String[values.length - 1];
        int count = 0;
        for(String letter : values){
            if(letter.equals(getMiddleElement(values))){
                continue;
            }
            else{
                newArray[count] = letter;
                count++;
            }
        }
        return newArray;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] newArray = new String[values.length - 1];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = values[i];
        }
        return newArray;
    }
}