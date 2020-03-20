package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return str.substring(0, str.length()/2) + Character.toUpperCase(getMiddleCharacter(str)) + str.substring(str.length()/2 + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return str.substring(0, str.length()/2) + Character.toLowerCase(getMiddleCharacter(str)) + str.substring(str.length()/2 + 1);
    }

    public static Boolean isIsogram(String str) {
        return str.chars().mapToObj(e -> (char) e).collect(Collectors.toSet()).size() == str.length();
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return str.length() != removeConsecutiveDuplicateCharacters(str).length();
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        for (int i = 0; i < str.toCharArray().length - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                str = removeCharacter(str, i);
            }
        }
        return str;
    }

    private static String removeCharacter(String str, int i) {
        return str.substring(0, i) + str.substring(i + 2);
    }

    public static String invertCasing(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.stream(str.chars().mapToObj(c -> (char)c).toArray(Character[]::new)).forEach(c -> stringBuilder.append(swapCase(c)));
        return stringBuilder.toString();
    }

    public static Character swapCase(char c) {
        return Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
    }
}