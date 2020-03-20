package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        char[] chars = string.toCharArray();
        int middleIndex = chars.length / 2;
        Character m = chars[middleIndex];
        return m;
    }

    public static String capitalizeMiddleCharacter(String str) {
        int middleIndex = str.length() / 2;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i != middleIndex) {
                result = result + str.charAt(i);
            }
            if (i == middleIndex) {
                result = result + Character.toUpperCase(str.charAt(i));
            }


        }
        return result;

    }

    public static String lowerCaseMiddleCharacter(String str) {
        int middleIndex = str.length() / 2;
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i != middleIndex) {
                result = result + str.charAt(i);
            }
            if (i == middleIndex) {
                result = result + Character.toLowerCase(str.charAt(i));
            }


        }

        return result;

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
        int len = str.length();

        char arr[] = str.toCharArray();
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return true;
        }
        return false;

    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                i++;
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        sb.append(str.charAt(str.length()-1));
        return sb.toString();

    }

    public static String invertCasing(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == Character.toUpperCase(str.charAt(i))) {
                result = result + Character.toLowerCase(str.charAt(i));
            } else
                result = result + Character.toUpperCase(str.charAt(i));
        }
        return result;
    }
}