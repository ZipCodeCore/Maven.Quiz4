package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
            String RM[]= new String[(values.length-1)];
            int count=0;
             for (int i=0; i< values.length; i++)
                 if( i==values.length/2)
                 {

                 }
                else{
                    RM[count]= values[i];
                    count++;
                 }
        return RM;
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String RL[] = new String[(values.length - 1)];
        for (int i = 0; i < values.length - 1; i++)
        {
            RL[i] = values[i];
    }
        return RL;
    }
}