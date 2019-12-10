package rocks.zipcode.quiz4.fundamentals;

import rocks.zipcode.quiz4.arrays.ArrayUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(ArrayUtils.middleIndex(string.length()));
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder();
        Integer idx = ArrayUtils.middleIndex(str.length());
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if (i == idx) s = s.toUpperCase();
            sb.append(s);
        }
        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder();
        Integer idx = ArrayUtils.middleIndex(str.length());
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if (i == idx) s = s.toLowerCase();
            sb.append(s);
        }
        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        String[] arr = str.split("");
        Set<String> setskis = new HashSet();
        for (String s : arr) {
            if (setskis.contains(s)) return false;
            setskis.add(s);
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 1; i < str.length(); i++) {
            String s1 = String.valueOf(str.charAt(i-1));
            String s2 = String.valueOf(str.charAt(i));
            if (s1.equals(s2)) return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder().append(str.charAt(0));
        String check = "";
        for (int i = 1; i < str.length(); i++) {
            String s1 = String.valueOf(str.charAt(i-1));
            String s2 = String.valueOf(str.charAt(i));
            String s3 = (i < str.length()-1) ? String.valueOf(str.charAt(i+1)) : "";
            if (!s1.equals(s2) && !s2.equals(s3)) {
                sb.append(s2);
            }
        }
        return sb.toString();
    }

    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (Character.isUpperCase(c)) c = Character.toLowerCase(c);
            else if (Character.isLowerCase(c)) c = Character.toUpperCase(c);
            sb.append(c);
        }
        return sb.toString();
    }
}