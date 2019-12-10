package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        char[] newArr = string.toCharArray();
        Character mid = newArr[newArr.length/2];
        return mid;
    }

    public static String capitalizeMiddleCharacter(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            if(str.indexOf(i) == str.indexOf(str.length()/2)){
//                str.indexOf(i)
//            }
//
//        }
//        Character mid = str[str.length/2];
//        Character x = getMiddleCharacter(mid);
//        return x.toString().toUpperCase();
        int index = str.length() / 2;
        return str.substring(0, index) + Character.toUpperCase(getMiddleCharacter(str)) + str.substring(index + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int index = str.length() / 2;
        return str.substring(0, index)+ Character.toLowerCase(getMiddleCharacter(str)) + str.substring(index+1);
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
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i-1) == str.charAt(i))
                return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for(int i = 1; i <= str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i-1)) {
                stringBuilder.replace(i - 1, i + 1, "");
            }
        }
        return stringBuilder.toString();
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