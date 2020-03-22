package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return str.substring(0,str.length()/2)
                + Character.toUpperCase(getMiddleCharacter(str))
                + str.substring(str.length()/2 +1, str.length());
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return str.substring(0,str.length()/2)
                + Character.toLowerCase(getMiddleCharacter(str))
                + str.substring(str.length()/2 +1, str.length());
    }

    public static Boolean isIsogram(String str) {
        int len = str.length();

        char[] arr = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] c = str.toCharArray();
        char temp = c[0];
        for (int i = 1; i < str.length(); i++) {
            if(temp != c[i])
                temp = c[i];
            else
                return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        char[] c = str.toCharArray();
        char temp = c[0];
        StringBuilder s = new StringBuilder(c[0] + "");
        int count  = 0;

        for (int i = 1; i < str.length(); i++) {
            if(temp != c[i]) {
                temp = c[i];
                s.append(temp);
                count = 0;
            }else{
                if(count==0){
                    s = new StringBuilder(s.substring(0, s.length() - 1));
                    count++;
                }
            }
        }

        return s.toString();
    }

    public static String invertCasing(String str) {
        StringBuilder newStr = new StringBuilder();
        for (char c:str.toCharArray()) {
            if(Character.isUpperCase(c))
                newStr.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c))
                newStr.append(Character.toUpperCase(c));
            else
                newStr.append(c);
        }
        return newStr.toString();
    }
}