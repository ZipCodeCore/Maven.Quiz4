package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {

        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        String[] answer = new String[values.length-1];
        Integer count= 0;
        for (int i = 0; i < values.length; i++) {
            if(!values[i].equals(getMiddleElement(values))){
                answer[count] = values[i];
                count++;
            }
        }
        return answer;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String[] answer = new String[values.length-1];
        Integer count= 0;
        for (int i = 0; i < values.length; i++) {
            if(i == 0){
                answer[count] = values[i];
                count++;
            }else if(!values[i].equals(getLastElement(values))){
                answer[count] = values[i];
                count++;
            }
        }
        return answer;
    }
}