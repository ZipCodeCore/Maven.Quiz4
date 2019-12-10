package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
//        Character middleChar;
//        int position;
//        int length;
//        if (string.length() % 2 == 0)
//        {
//            position = string.length() / 2 - 1;
//            length = 2;
//        }
//        else
//        {
//            position = string.length() / 2;
//            length = 1;
//        }
//        return middleChar.substring(position, position + length);
        return null;
    }

    public static String capitalizeMiddleCharacter(String str) {
//        char[] newStr = new char[0];
//        for (int i = 0; i < str.length(); i++) {
//            if(str.length() % 2 == 1)
//                newStr[i] += str.charAt(i);
//        }
//
        return null;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return null;
    }

    public static Boolean isIsogram(String str) {
        int len = str.length();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return null;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)){
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)){
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}