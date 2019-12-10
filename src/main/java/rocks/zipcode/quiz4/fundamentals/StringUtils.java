package rocks.zipcode.quiz4.fundamentals;



import java.util.*;
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
        String[] charArray = str.split("");
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i].equals(charArray[i + 1])) {
                charArray[i] = "0";
                charArray[i+1] ="0";
            }
        }
        List<String> result = Arrays.stream(charArray).filter(c -> !c.equals("0")).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (String s : result) {
            sb.append(s);
        }
        return sb.toString();
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