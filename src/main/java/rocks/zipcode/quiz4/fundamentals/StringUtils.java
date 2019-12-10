package rocks.zipcode.quiz4.fundamentals;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String begin = str.substring(0, str.length() / 2);
        String end = str.substring((str.length() / 2) + 1);
        return begin + Character.toUpperCase(getMiddleCharacter(str)) + end;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String begin = str.substring(0, str.length() / 2);
        String end = str.substring((str.length() / 2) + 1);
        return begin + Character.toLowerCase(getMiddleCharacter(str)) + end;
    }

    public static Boolean isIsogram(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }
        if (uniqueChars.size() == str.length())
            return true;
        else
            return false;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        Character toRemove = null;
        String newStr = "";
        sb.append(str);
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1))
                toRemove = str.charAt(i);
                newStr = newStr + removeCharacter(str, toRemove);
                sb.append(i+1);
        }

//        return Arrays.stream(sb.toCharArray()).filter(c -> !c.equals("0")).collect(Collectors.toList()).toString();
        return sb.toString();
    }

    public static String removeCharacter(String value, Character charToRemove) {
        StringBuilder builderValue = new StringBuilder();
        String strWithCharRemoved = "";
        for(int i = 0; i < value.length(); i++) {
            if(value.charAt(i) != charToRemove) {
                builderValue.append(value.charAt(i));
            }
            strWithCharRemoved = builderValue.toString();
        }
        return strWithCharRemoved;
    }

    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                sb.append(Character.toLowerCase(str.charAt(i)));
            else
                sb.append(Character.toUpperCase(str.charAt(i)));
        }
        return sb.toString();
    }
}