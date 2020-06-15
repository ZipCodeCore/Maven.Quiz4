package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }
    
    public static String capitalizeMiddleCharacter(String str) {
        char charred = str.charAt(str.length() / 2);
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (char c : chars)
            if (c != charred) {
                sb.append(c);
            } else {
                sb.append(getMiddleCharacter(str.toUpperCase()));
            }
        return sb.toString();
        
        //return String.valueOf(getMiddleCharacter(str.toUpperCase()));
    }
    
    public static String lowerCaseMiddleCharacter(String str) {
        char charred = str.charAt(str.length() / 2);
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (char c : chars)
            if (c != charred) {
                sb.append(c);
            } else {
                sb.append(getMiddleCharacter(str.toLowerCase()));
            }
        return sb.toString();
    }
    
    public static Boolean isIsogram(String str) {
        Set<String> set = new HashSet<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (!set.add(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
    
    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char previousChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (previousChar == str.charAt(i)) {
                return true;
            } else {
                previousChar = str.charAt(i);
            }
        }
        return false;
    }
    
    public static String removeConsecutiveDuplicateCharacters(String str) {
        if (hasDuplicateConsecutiveCharacters(str)) {
            return str.replaceAll("(.)\\1+", "");
        } else {
            return str;
        }
    }
    
    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (!Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    public static String midCharacterCaseChanger(String input,
                                                 boolean upperCase) {
        char[] arr = input.toCharArray();
        int strLength = input.length() / 2;
        char midCharacter = input.charAt(strLength);
        if (upperCase) {
            arr[midCharacter] = Character.toUpperCase(midCharacter);
            return Arrays.toString(arr);
        } else arr[midCharacter] = Character.toLowerCase(midCharacter);
        return Arrays.toString(arr);
    }
}