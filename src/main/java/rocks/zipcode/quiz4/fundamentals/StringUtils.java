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
        StringBuilder sb = new StringBuilder(str);

        sb.setCharAt(str.length() / 2, Character.toUpperCase(getMiddleCharacter(str)));

        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {

        StringBuilder sb = new StringBuilder(str);

        sb.setCharAt(str.length() / 2, Character.toLowerCase(getMiddleCharacter(str)));

        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        return str.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size() == str.length();
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return str.length() != removeConsecutiveDuplicateCharacters(str).length();
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 1; i < sb.length(); i++) {
            if(sb.charAt(i)==sb.charAt(i-1)){
                sb.delete(i-1,i+1);
            }
        }
        return sb.toString();
    }

    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder();
        Arrays.stream(str.chars().mapToObj(letter -> (char) letter).toArray(Character[]::new))
                .forEach(letter ->sb.append(Character.isUpperCase(letter) ? Character.toLowerCase(letter) : Character.toUpperCase(letter)));
        return sb.toString();
    }
}