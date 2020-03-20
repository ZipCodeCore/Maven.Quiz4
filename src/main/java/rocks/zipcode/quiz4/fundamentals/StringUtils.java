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

        String prefix = str.substring(0, str.length() / 2);

        Character character = str.charAt(str.length() / 2);

        String suffix = str.substring(str.length() / 2 + 1);

        return prefix + character.toString().toUpperCase() + suffix;
    }

    public static String lowerCaseMiddleCharacter(String str) {

        String prefix = str.substring(0, str.length() / 2);

        Character character = str.charAt(str.length() / 2);

        String suffix = str.substring(str.length() / 2 + 1);

        return prefix + character.toString().toLowerCase() + suffix;
    }

    public static Boolean isIsogram(String str) {
    return !StringUtils.hasDuplicateConsecutiveCharacters(str);
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }


    public static String removeConsecutiveDuplicateCharacters(String str) {

            char[] chars = str.toCharArray();
            char prev = '\0';
            int k = 0;

            for (int i = 0; i < chars.length; i++)
            {
                if (prev != chars[i]) {
                    chars[k++] = chars[i];
                    prev = chars[i];
                }
            }

            return new String(chars).substring(0, k);
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