package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        if (string.length() % 2 == 0) {
            return string.charAt((string.length() / 2) - 1);
        } else {
            return string.charAt(string.length() / 2);
        }
    }

    public static String capitalizeMiddleCharacter(String str) {
        String result = "";
        result = getMiddleCharacter(str).toString().toUpperCase();

        return str.substring(0, str.length() / 2) + result + str.substring((str.length() / 2 + 1));
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String result = "";
        result = getMiddleCharacter(str).toString().toLowerCase();
        return str.substring(0, str.length() / 2) + result + str.substring((str.length() / 2 + 1));
    }

    public static Boolean isIsogram(String str) {
        char[] array = str.toCharArray();
        Arrays.sort(array);

        for (int i = 0; i < array.length - 1; i++)
            if (array[i] == array[i + 1])
                return false;

        return true;
    }
        /*for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return false;
            }
        }
        return true;
         */

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String output = "";

        if (str.charAt(0) != str.charAt(1)) output += str.charAt(0);

        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1) && str.charAt(i) != str.charAt(i - 1)) output += str.charAt(i);
        }

        if (str.charAt(str.length() - 1) != str.charAt(str.length() - 2)) output += str.charAt(str.length() - 1);
        return output;
    }

    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                sb.append(Character.toLowerCase(str.charAt(i)));
            } else {
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return sb.toString();
    }
}
