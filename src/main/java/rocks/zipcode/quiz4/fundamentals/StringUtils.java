package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
            char[] arr = str.toCharArray();
            int middle = arr.length/2;
            arr[middle] = Character.toUpperCase(arr[middle]);
            String result = new String(arr);
        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        char[] arr = str.toCharArray();
        int middle = arr.length/2;
        arr[middle] = Character.toLowerCase(arr[middle]);
        String result = new String(arr);

        return result;
    }

    public static Boolean isIsogram(String str) {
        // Convert the string in lower case letters
        //str = str.toLowerCase();
        int len = str.length();
        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }
    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return (str.matches(".*(.)\\1.*"));
    }
    public static String removeConsecutiveDuplicateCharacters(String str) {

        //return str.replaceAll("(.+?)\\1+", "");
        //return str.replaceAll("([a-zA-Z])\\1\\1+", "$1$1$1");
        //return str.replaceAll("((.)\\2{2})\\2+","$1$1");
        return str.replaceAll("(.)(\\1)","");
    }

    public static String invertCasing(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
            c = Character.toUpperCase(c);
        }
        result.append(c);
    }
        return result.toString();
    }
}