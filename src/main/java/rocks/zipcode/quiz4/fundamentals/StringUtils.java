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
        StringBuilder builder = new StringBuilder(str);
        char middleChar = str.charAt(str.length() / 2);
        String strMiddle = Character.toString(middleChar);
        strMiddle = strMiddle.toUpperCase();
        char[] upperMiddleChar = strMiddle.toCharArray();
        builder.setCharAt((str.length() / 2), upperMiddleChar[0]);
        return builder.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder builder = new StringBuilder(str);
        char middleChar = str.charAt(str.length() / 2);
        String strMiddle = Character.toString(middleChar);
        strMiddle = strMiddle.toLowerCase();
        char[] upperMiddleChar = strMiddle.toCharArray();
        builder.setCharAt((str.length() / 2), upperMiddleChar[0]);
        return builder.toString();
    }

    public static Boolean isIsogram(String str) {
        char[] characters = str.toCharArray();
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : characters){
            if (!uniqueChars.add(c)){
                return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] characters = str.toCharArray();
        for (int i = 0; i < characters.length - 1; i++){
            if (characters[i] == characters[i + 1]){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        char[] characters = str.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < characters.length; i++){
            if (characters[i] != characters[i - 1]){
                builder.append(characters[i]);
            }
        }
        return builder.toString();
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}