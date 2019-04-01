package rocks.zipcode.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        int middleIndex = str.length() / 2;
        return str.substring(0, middleIndex) + Character.toUpperCase(getMiddleCharacter(str)) + str.substring(middleIndex + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int middleIndex = str.length() / 2;
        return str.substring(0, middleIndex) + Character.toLowerCase(getMiddleCharacter(str)) + str.substring(middleIndex + 1);
    }

    public static Boolean isIsogram(String str) {
        Set resultSet = new HashSet();
        for(int i = 0; i < str.length(); i++){
            resultSet.add(str.charAt(i));
        }
        return str.length() == resultSet.size();
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String result = "";
        int index = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                result += str.substring(index, i - 1);
                index = i + 1;
            }
        }
        result += str.substring(index);
        return result;
    }

    public static String invertCasing(String str) {
        String[] splitString = str.split("");
        String result = "";
        for (String s : splitString) {
            if (Character.isUpperCase(s.charAt(0))) {
                result += s.toLowerCase();
            } else {
                result += s.toUpperCase();
            }
        }
        return result;
    }
}