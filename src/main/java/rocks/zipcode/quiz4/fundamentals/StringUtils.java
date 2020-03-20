package rocks.zipcode.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {

       Character middleChar = getMiddleCharacter(str);
        return middleChar.toString().toUpperCase();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        Character middleChar = getMiddleCharacter(str);
        return middleChar.toString().toLowerCase();
    }

    public static Boolean isIsogram(String str) {
        String[] arr = str.split("");
        Set<String> mySet = new HashSet<String>(Arrays.asList(arr));
        if (str.length() == mySet.size()) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        Boolean answer = false;
        for (int i = 0, j = i + 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(j)) {
                answer = true;

            }
        }
        return answer;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        char[]strToChar =str.toCharArray();
            char previous  ='\0';
            int k = 0;
        for (int i = 0; i <strToChar.length ; i++) {
            if(previous!= strToChar[i]){
                strToChar[k++] = strToChar[i];
                previous = strToChar[i];
            }
        }
        return new String(strToChar).substring(0,k);
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