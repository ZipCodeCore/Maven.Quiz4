package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        Integer index = string.length() / 2;
        return string.charAt(index);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == (str.length() / 2)) {
                sb.append(str.toUpperCase().charAt(i));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == (str.length() / 2)) {
                sb.append(str.toLowerCase().charAt(i));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        str = str.toLowerCase();
        int length = str.length();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < length; i++) {
            if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] newStr = str.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            if (newStr[i] == newStr[i + 1]) {
                return true;
            }
        }
        return false;

    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }


    public static String invertCasing(String str) {
        char[] newArr = str.toCharArray();
        for (int i = 0; i < newArr.length; i++) {
            char c = newArr[i];
            if (Character.isUpperCase(c)) {
                newArr[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                newArr[i] = Character.toUpperCase(c);
            }
        }
        return new String(newArr);
    }
}