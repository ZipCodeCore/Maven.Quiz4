package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        char[] result = string.toCharArray();
        return result[result.length/2];
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuffer sb =new StringBuffer(str);
        char mid =Character.toUpperCase(sb.charAt(sb.length()/2));
        sb.setCharAt(sb.length()/2, mid);
        return sb.toString();
        }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuffer sb =new StringBuffer(str);
        char mid =Character.toLowerCase(sb.charAt(sb.length()/2));
        sb.setCharAt(sb.length()/2, mid);
        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < str.length() - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
}

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char arr[] = str.toCharArray();


        for (int i = 0; i < str.length() - 1; i++) {
            if (arr[i] == arr[i + 1])
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