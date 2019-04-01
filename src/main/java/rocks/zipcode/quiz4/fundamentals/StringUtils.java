package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String sub1 = str.substring(0,str.length() / 2);
        Character mid = Character.toUpperCase(getMiddleCharacter(str));
        String sub2 = str.substring((str.length() / 2) + 1);

        return sub1 + mid + sub2;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String sub1 = str.substring(0,str.length() / 2);
        Character mid = Character.toLowerCase(getMiddleCharacter(str));
        String sub2 = str.substring((str.length() / 2) + 1);

        return sub1 + mid + sub2;
    }

    public static Boolean isIsogram(String str) {
        boolean result = true;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return result;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        boolean result = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                return true;
            }
        }
        return result;
    }
//Mississippi
    public static String removeConsecutiveDuplicateCharacters(String str) {
        ArrayList<String> toRemove = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                String remove = str.substring(i, i+2);
                toRemove.add(remove);
            }
        }

        String newString = str;
        for (String s: toRemove) {
            newString = newString.replace(s, "");
        }

        return newString;
    }

    public static String invertCasing(String str) {
        StringBuilder inverted = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                inverted.append(Character.toLowerCase(str.charAt(i)));
            } else if(Character.isLowerCase(str.charAt(i))) {
                inverted.append(Character.toUpperCase(str.charAt(i)));
            } else {
                inverted.append(str.charAt(i));
            }
        }

        return inverted.toString();
    }
}