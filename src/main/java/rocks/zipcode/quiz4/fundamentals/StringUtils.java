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
        return str.substring(0, str.length() / 2) + getMiddleCharacter(str.toUpperCase()) + str.substring(( str.length() / 2 ) + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return str.substring(0, str.length() / 2) + getMiddleCharacter(str.toLowerCase()) + str.substring(( str.length() / 2 ) + 1);
    }

    public static Boolean isIsogram(String str) {
        int len = str.length();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len - 1; j++) {
                if (arr[i] == arr[j + 1])
                    return false;
            }
        }
        return true;
    };


    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        int len = str.length();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return true;
        }
        return false;
    }


    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
        return null;
    }
}