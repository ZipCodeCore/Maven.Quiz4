package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuffer sb = new StringBuffer(str);
        char ch=Character.toUpperCase(sb.charAt(str.length()/2));
        sb.setCharAt(str.length()/2,ch);
        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuffer sb = new StringBuffer(str);
        char ch=Character.toLowerCase(sb.charAt(str.length()/2));
        sb.setCharAt(str.length()/2,ch);
        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        for(int i = 0 ; i <= str.length() ; i++){
            for(int j = i + 1 ; j < str.length() ; j++){
                if (str.charAt(i) != str.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for( int i = 1 ; i < str.length() ; i++){
            if(str.charAt(i) == str.charAt(i-1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String string = "";
        for(int i = 1 ; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(i-1)){
                string += str.charAt(i-1);
            }
        }
        System.out.println(string);
       // return string;
        return str.replaceAll("(.)\\1{1,}", "$1");
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