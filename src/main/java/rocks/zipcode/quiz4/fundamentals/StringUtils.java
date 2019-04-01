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
        int middle = str.length()/2;
        return str.substring(0, middle) + Character.toUpperCase(getMiddleCharacter(str)) + str.substring(middle + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int middle = str.length()/2;
        return str.substring(0, middle) + Character.toLowerCase(getMiddleCharacter(str)) + str.substring(middle + 1);
    }

    public static Boolean isIsogram(String str) {
        Set<Character> characterSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (characterSet.contains(c)){
                return false;
            }
            characterSet.add(c);
        }
        return true;
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
        for (char c : str.toCharArray()) {
            stringBuilder.append(swapCase(c));
        }
        //Stream<Character> stream = Arrays.stream(str.chars().mapToObj(c -> (char)c).toArray(Character[]::new)).forEach(StringUtils::swapCase);
        return stringBuilder.toString();
    }

    public static Character swapCase(char c) {
        return Character.isUpperCase(c) ?
                Character.toLowerCase(c) :
                Character.toUpperCase(c);
    }
}