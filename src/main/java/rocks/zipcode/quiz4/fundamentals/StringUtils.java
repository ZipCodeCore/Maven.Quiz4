package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        char[] chars = new char[str.length()];
        chars[str.length()/2] = Character.toUpperCase(chars[str.length()/2]);
        return String.valueOf(chars);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        char[] chars = new char[str.length()];
        chars[str.length()/2] = Character.toLowerCase(chars[str.length()/2]);
        return String.valueOf(chars);
    }

    public static Boolean isIsogram(String str) {
        char[] chars = str.toCharArray();
        Set<Character> set = new HashSet<Character>();
        for(char ch : chars) {
            set.add(ch);
        }
        if(set.size() == str.length()){
            return true;
        }else return false;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return null;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
        return null;
    }
}