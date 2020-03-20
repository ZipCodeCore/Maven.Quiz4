package rocks.zipcode.quiz4.fundamentals;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        char [] strArray = string.toCharArray();
        return strArray[(string.length())/2];
    }

    public static String capitalizeMiddleCharacter(String str) {
        String [] strArray = str.split("");
        Integer midIndex = str.length()/2;
        strArray[midIndex] = strArray[midIndex].toUpperCase();
        return String.join("", strArray);
        //Or using a stream: String joined = Arrays.stream(strArray).collect(Collectors.joining());
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String [] strArray = str.split("");
        Integer midIndex = str.length()/2;
        strArray[midIndex] = strArray[midIndex].toLowerCase();
        String joined = Arrays.stream(strArray).collect(Collectors.joining());
        return joined;
    }

    public static Boolean isIsogram(String str) {
        Map<Character, Long> charMap = new HashMap<>();
        char [] strArray = str.toCharArray();
        Character [] nonPrimitiveArray = new Character[strArray.length];
        for (int i = 0; i < nonPrimitiveArray.length; i++) {
            nonPrimitiveArray[i] = (Character) strArray[i];
        }
        charMap = Arrays.stream(nonPrimitiveArray).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        for (Long count : charMap.values()) {
            if (count >= 2) {
                return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {


        String[] strArray = str.split("");

        if (strArray[str.length() -1].equals(str.length() - 2)){
            return true;
        }
        for (int i = 0; i < str.length() - 2; i++) {
            if (strArray[i].equals(strArray[i + 1])) {
                return true;
            }
        }
        return false;
        }


    public static String removeConsecutiveDuplicateCharacters(String str) {
        if(hasDuplicateConsecutiveCharacters(str)==true){

            String[] strArray = str.split("");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length() - 2; i++) {
                if (strArray[i].equals(strArray[i + 1])) {
                    i=i+1;
                } else if (!strArray[i].equals(strArray[i + 1])) {
                    sb.append(strArray[i]);
                }
            }
                if (!strArray[str.length() - 1].equals(str.length() - 2)) {
                    sb.append(strArray[str.length() - 1]);
                }
                return sb.toString();
        }
        else { return str;}
    }


    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder(str);
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (Character.isLowerCase(c))
            {
                sb.replace(i, i + 1, String.valueOf(Character.toUpperCase(c)));
            }
            else
            {
                sb.replace(i, i + 1, String.valueOf(Character.toLowerCase(c)));
            }
        }
        return sb.toString();
    }
}