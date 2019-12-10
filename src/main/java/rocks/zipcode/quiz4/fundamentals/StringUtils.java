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
        String newStr = "";
        int index = str.length() / 2;
        newStr += str.substring(0, index);
        newStr += Character.toUpperCase(str.charAt(index));
        newStr += str.substring(index + 1);
        return newStr;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String newStr = "";
        int index = str.length() / 2;
        newStr += str.substring(0, index);
        newStr += Character.toLowerCase(str.charAt(index));
        newStr += str.substring(index + 1);
        return newStr;
    }

    public static Boolean isIsogram(String str) {
        String string = str.toLowerCase();
        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < string.length() - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
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
        String string = "";

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                i=i+2;
            }
            string += str.charAt(i);
        }
        return string;
    }

    public static String invertCasing(String str) {
        String string = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                string += Character.toLowerCase(str.charAt(i));
            } else if (Character.isLowerCase(str.charAt(i))) {
                string += Character.toUpperCase(str.charAt(i));
            }else{
            string+=str.charAt(i);

        }

    }
        return string;
}}