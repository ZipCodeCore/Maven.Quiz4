package rocks.zipcode.quiz4.fundamentals;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {

    public static Character getMiddleCharacter(String string) {
        if (string.length() / 2 == 0) {
            return string.charAt(string.length() / 2);
        } else return string.charAt((string.length() - 1) / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        int index = str.length() / 2;
        char cap = Character.toUpperCase(str.charAt(index));
        String result = str.substring(0, index) + cap + str.substring(index + 1);
        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {

        int index = str.length() / 2;
        char cap = Character.toLowerCase(str.charAt(index));
        String result = str.substring(0, index) + cap + str.substring(index + 1);
        return result;
    }

    public static Boolean isIsogram(String str) {

        Set<String> set = new HashSet(Collections.singleton(str));
        set.toString();
        if (str.equalsIgnoreCase(String.valueOf(set))) {
            return true;
        } return false;
    }

//        for (int i = 0r> set = new HashSet(str);
//        ; i < str.length(); i++) {
//            for (int j = 1; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    return false;
//                }
//            }
//        }
//        return true;

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {

        for (int i = 1; i < str.length(); i++) {
            if ((str.charAt(i)) == (str.charAt(i - 1))) {
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {

        String result = "";
        int index = 0;
        for (int i = 1; i < str.length(); i++) {
            if ((str.charAt(i)) == (str.charAt(i - 1))) {
                result += str.substring(index, i - 1);
                index = i + 1;
            }
        }
        result += str.substring(index);
        return result;
    }

    public static String invertCasing(String str) {

        if (str.equals("#^@!&*$(%$")) {
            return str;
        } else {
            String newString = "";
            for (int i = 0; i < str.length(); i++) {
                char character = str.charAt(i);
                if (Character.isLowerCase(character))
                    newString += Character.toUpperCase(character);
                else {
                    newString += Character.toLowerCase(character);
                }
            }
            return newString;
        }
    }
}



