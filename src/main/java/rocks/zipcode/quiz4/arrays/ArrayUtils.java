package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        int mid = values.length/2;
        return values[mid];
    }

    public static String[] removeMiddleElement(String[] values) {

        String ans = "";

        for(int i = 0; i < values.length; i++){
            if(i != values.length/2){
                ans+= values[i] + " ";
            }
        }
        return ans.split(" ");
    }

    public static String getLastElement(String[] values) {

        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {

        String answer = "";

        for(int i = 0; i < values.length; i++){
            if(i != values.length-1){
                answer+= values[i] + " ";
            }
        }
        return answer.split(" ");
    }
}