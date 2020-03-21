package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        Character midChar;

        midChar = string.charAt(string.length() / 2);

//      midChar = string.charAt((string.length() / 2)+1);

        return midChar;
    }

    public static String capitalizeMiddleCharacter(String str) {
        Integer midIndex = str.length() / 2;
        return str.substring(0, midIndex) + Character.toUpperCase(str.charAt(midIndex)) + str.substring(midIndex + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        Integer midIndex = str.length() / 2;

        return str.substring(0, midIndex) + Character.toLowerCase(str.charAt(midIndex)) + str.substring(midIndex + 1);
    }

    public static Boolean isIsogram(String str) {
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);

        for (int i = 0; i <str.length()-1 ; i++) {
            if(charArr[i] == charArr[i+1])
                return false;
        }

        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        Boolean flag = false;

        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                flag = true;
            }
        }

        return flag;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder builder = new StringBuilder();

        if(hasDuplicateConsecutiveCharacters(str)) {
           int index;
            builder.append(str.charAt(0));
            for (int i = 1; i <str.length()-1 ; i++) {
                char prev = str.charAt(i-1);
                char next = str.charAt(i+1);

                if(str.charAt(i) != prev && str.charAt(i) != next){
                    builder.append(str.charAt(i));
                }
                
            }
            builder.append(str.charAt(str.length()-1));

           // str.chars().distinct().forEach(x -> builder.append((char) x));
        }
        else{
            return str;
        }

        return builder.toString();
    }

    public static String invertCasing(String str) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) && Character.isLowerCase(str.charAt(i))) {
                builder.append(Character.toUpperCase(str.charAt(i)));
            } else if (Character.isLetter(str.charAt(i)) && Character.isUpperCase(str.charAt(i))) {
                builder.append(Character.toLowerCase(str.charAt(i)));
            } else {
                builder.append(str.charAt(i));
            }

        }

        return builder.toString();
    }
}