package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        Character getMiddleChar = string.charAt(string.length() / 2);
        return getMiddleChar;
    }

    public static String capitalizeMiddleCharacter(String str) {
        Character middleChar;

        if (str.length() % 2 == 0) {
            middleChar = str.charAt(str.length() / 2 - 1);
            String capMiddleChar = str.replace(middleChar, Character.toUpperCase(middleChar));
            return capMiddleChar;
        } else {
            middleChar = str.charAt(str.length() / 2);
            String capMiddleChar = str.replace(middleChar, Character.toUpperCase(middleChar));
            return capMiddleChar;
        }
    }

    public static String lowerCaseMiddleCharacter(String str) {
        Character middleChar;

        if (str.length() % 2 == 0) {
            middleChar = str.charAt(str.length() / 2 - 1);
            String lowerMiddleChar = str.replace(middleChar, Character.toLowerCase(middleChar));
            return lowerMiddleChar;
        } else {
            middleChar = str.charAt(str.length() / 2);
            String lowerMiddleChar = str.replace(middleChar, Character.toLowerCase(middleChar));
            return lowerMiddleChar;
        }
    }

    public static Boolean isIsogram(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                return true;
            } else {
                return false;
            }

        }
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {


        if (str.charAt(i) != str.charAt(i + 1)) {
            return true;
        } else {
            return false;
        }


    }
return null;
}
    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
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

