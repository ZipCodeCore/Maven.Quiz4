package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String newString = "";
        char[] letters = str.toCharArray();
        for(int i = 0; i < letters.length; i++) {
            if(i == str.length() / 2) {
                newString += getMiddleCharacter(str).toString().toUpperCase();
            } else {
                newString += letters[i];
            }
        }
        return newString;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String newString = "";
        char[] letters = str.toCharArray();
        for(int i = 0; i < letters.length; i++) {
            if(i == str.length() / 2) {
                newString += getMiddleCharacter(str).toString().toLowerCase();
            } else {
                newString += letters[i];
            }
        }
        return newString;
    }

    public static Boolean isIsogram(String str) {

        char[] letters = str.toCharArray();
        Arrays.sort(letters);

        for (int i = 0; i < letters.length-1; i++) {
            if(letters[i] == letters[i+1]) {
                    return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length-1; i++) {
            if(letters[i] == letters[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String regex = "(.)(\\1)+";
        String newString = str.replaceAll(regex, "");
        return newString;
    }

    public static String invertCasing(String str) {
        String newString = "";
        char[] letters = str.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if(Character.isUpperCase(letters[i])) {
                newString += Character.toLowerCase(letters[i]);
            } else if (Character.isLowerCase(letters[i])) {
                newString += Character.toUpperCase(letters[i]);
            } else {
                newString += letters[i];
            }
        }
        return newString;
    }
}