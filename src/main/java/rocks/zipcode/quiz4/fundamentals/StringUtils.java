package rocks.zipcode.quiz4.fundamentals;

import java.util.HashSet;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        int index = str.length()/2;
        return str.substring(0, index) + ((Character)str.charAt(index)).toString().toUpperCase() + str.substring(index + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int index = str.length()/2;
        return str.substring(0, index) + ((Character)str.charAt(index)).toString().toLowerCase() + str.substring(index + 1);
    }

    public static Boolean isIsogram(String str) {
        HashSet<Character> characters = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(!characters.add(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        if (str.length() > 1) {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        if (str.length() > 1) {
            String result = "";
            for (int i = 0; i < str.length() - 1; i++) {
                if (!(str.charAt(i) == str.charAt(i + 1))){
                    result += str.charAt(i);
                }
                else i++;
            }
            if (!(str.charAt(str.length() - 2) == str.charAt(str.length() - 1))){
                result += str.charAt(str.length() - 1);
            }
            return result;
        }
        return str;
    }

    public static String invertCasing(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            Character current = str.charAt(i);
            if (current >= 'a' && current <= 'z') {
                result += current.toString().toUpperCase();
            }
            else if (current >= 'A' && current <= 'Z') {
                result += current.toString().toLowerCase();
            }
            else {
                result += current;
            }
        }
        return result;
    }
}