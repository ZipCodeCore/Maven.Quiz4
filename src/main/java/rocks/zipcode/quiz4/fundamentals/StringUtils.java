package rocks.zipcode.quiz4.fundamentals;

import java.util.HashMap;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        int characterIndex = middleCharacterIndex(string);

        return string.charAt(characterIndex);
    }

    public static String capitalizeMiddleCharacter(String str) {

        int characterIndex = middleCharacterIndex(str);
        StringBuilder sb = new StringBuilder(str);
        Character middleCharacter = Character.toUpperCase(getMiddleCharacter(str));
        sb.setCharAt(characterIndex, middleCharacter);
        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int characterIndex = middleCharacterIndex(str);
        StringBuilder sb = new StringBuilder(str);
        Character middleCharacter = Character.toLowerCase(getMiddleCharacter(str));
        sb.setCharAt(characterIndex, middleCharacter);
        return sb.toString();
    }

    public static Boolean isIsogram(String str) {

        for (int i = 0; i < str.length() -1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }

        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
            return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        if(!hasDuplicateConsecutiveCharacters(str)) {
            return str;
        }
        return str.replaceAll("(\\w)\\1+","");
    }

    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(sb.charAt(i)) && Character.isUpperCase(sb.charAt(i))) {
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            } else if (Character.isLetter(sb.charAt(i)) && Character.isLowerCase(sb.charAt(i))) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }
        return sb.toString();
    }


    public static int middleCharacterIndex(String string) {
        int characterIndex = string.length();
        if (characterIndex % 2 == 1) {
            characterIndex = characterIndex / 2;
        } else {
            characterIndex = (characterIndex / 2) - 1;
        }
        return characterIndex;
    }
}
