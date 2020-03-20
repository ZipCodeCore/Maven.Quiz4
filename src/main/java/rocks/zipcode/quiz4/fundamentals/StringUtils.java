package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {

        char[] arr = str.toCharArray();
        int i = arr.length/2;
        arr[i]= Character.toUpperCase(arr[i]);
        String result = new String(arr);

        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        char[] arr = str.toCharArray();
        int i = arr.length/2;
        arr[i]= Character.toLowerCase(arr[i]);
        String result = new String(arr);

        return result;
    }

    public static Boolean isIsogram(String str) {
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        for(int i = 0; i < str.length()-1; i++){
            if(arr[i] == arr[i +1])
                return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return null;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
        return null;
    }
}