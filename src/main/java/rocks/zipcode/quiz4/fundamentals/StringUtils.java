package rocks.zipcode.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        int index = str.length()/2;
        return str.substring(0, index) + Character.toUpperCase(str.charAt(index)) + str.substring(index + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int index = str.length()/2;
        return str.substring(0, index) + Character.toLowerCase(str.charAt(index)) + str.substring(index + 1);
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
        String patternString = "(\\w)\\1+";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(str);
        return matcher.find();
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return str.replaceAll("(\\w)\\1+", "");
    }

    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder(str);
        char c;
        for (int i = 0; i < sb.length(); i++) {
            c = sb.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (Character.isUpperCase(c)) {
                    sb.setCharAt(i, Character.toLowerCase(c));
                } else {
                    sb.setCharAt(i, Character.toUpperCase(c));
                }
            }
        }
        return sb.toString();
    }
}