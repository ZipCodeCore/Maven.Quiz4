package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return str.substring(0, str.length() / 2) + getMiddleCharacter(str.toUpperCase()) + str.substring(( str.length() / 2 ) + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return str.substring(0, str.length() / 2) + getMiddleCharacter(str.toLowerCase()) + str.substring(( str.length() / 2 ) + 1);
    }

    public static Boolean isIsogram(String str) {
        int len = str.length();

        char[] arr = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j])
                    return false;
            }
        }
            return true;
        }


    public static Boolean hasDuplicateConsecutiveCharacters(String str) {

        for (int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == str.charAt(i + 1)){
                return true;
            }
        }
        return false;
    }


    public static String removeConsecutiveDuplicateCharacters(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                str = str.substring(0, i) + str.substring(i + 2);
            }
        }
        return str;
    }

    public static String invertCasing(String str) {
        StringBuilder builder = new StringBuilder();
        for (Character chr : str.toCharArray()){
            if (Character.isUpperCase(chr)){
                builder.append(Character.toLowerCase(chr));
            } else {
                builder.append(Character.toUpperCase(chr));
            }
        }
        return builder.toString();
    }
}
