package rocks.zipcode.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {

        String result = "";
        String prefix = str.substring(0, str.length()/2);
        String toCapitalize = getMiddleCharacter(str).toString().toUpperCase();
        String suffix = str.substring((str.length()/2)+1);
        result = prefix+toCapitalize+suffix;
        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {

        String result = "";
        String prefix = str.substring(0, str.length()/2);
        String toCapitalize = getMiddleCharacter(str).toString().toLowerCase();
        String suffix = str.substring((str.length()/2)+1);
        result = prefix+toCapitalize+suffix;
        return result;
    }

    public static Boolean isIsogram(String str) {

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (!set.add(str.charAt(i))) {
                return false;
            }
        }
        return true;
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

        StringBuilder sb = new StringBuilder(str);
        Character character;
        for (int i = 0; i < sb.length(); i++) {
            character = sb.charAt(i);
            if (Character.isAlphabetic(character)) {
                if (Character.isUpperCase(character)) {
                    sb.setCharAt(i, Character.toLowerCase(character));
                } else {
                    sb.setCharAt(i, Character.toUpperCase(character));
                }
            }
        }
        return sb.toString();
    }

}