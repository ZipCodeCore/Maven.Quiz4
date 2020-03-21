package rocks.zipcode.quiz4.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
//        Character[] characters = new Character[string.length()];
        char letter = 'a';
        letter = string.charAt(string.length() / 2);
        return letter;
    }

    public static String capitalizeMiddleCharacter(String str) {
        if(str.length() > 1) {
            char[] chars = str.toCharArray();
          chars[chars.length/2] = Character.toUpperCase(chars[chars.length / 2]);

                String str2 = new String(chars);
                return str2;
            }   return str.toUpperCase();
        }



    public static String lowerCaseMiddleCharacter(String str) {
        if(str.length() > 1) {
            char[] chars = str.toCharArray();
            chars[chars.length/2] = Character.toLowerCase(chars[chars.length / 2]);

            String str2 = new String(chars);
            return str2;
        }   return str.toLowerCase();
    }


    public static Boolean isIsogram(String str) {
        if(str.length() <=1) {
            return true;
        }
        for(int i = 0; i < str.length()-1; i++) {
            for(int j = i + 1; j < str.length(); j++)
            if (str.charAt(i) == str.charAt(j)) {
                return false;
            }
        }   return true;

    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        if(str.length() <= 1)   {
            return false;
        }   for(int i = 1; i < str.length(); i++)   {
            if(str.charAt(i) == str.charAt(i - 1))   {
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
//        char[] chars = str.toCharArray();
//        int length = chars.length;
//        for(int i = 0; i < length; i++) {
//            for ()
        return null;
    }


    public static String invertCasing(String str) {
        String str2 = "";
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++)   {
            if(Character.isAlphabetic(chars[i]) && Character.isLowerCase(chars[i])) {
                str2 +=  Character.toUpperCase(chars[i]);
            }   if(Character.isAlphabetic(chars[i]) && Character.isUpperCase(chars[i])) {
                str2 += Character.toLowerCase(chars[i]);
            }   if(!Character.isAlphabetic(chars[i]))   {
                str2 += chars[i];
            }

        }
        return str2;
    }
}