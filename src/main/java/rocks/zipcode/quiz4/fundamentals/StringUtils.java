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
        int lenghtOfString = string.length();
        return string.charAt(lenghtOfString / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        Integer indexOfMiddle = str.length() / 2;
        stringBuilder.replace( indexOfMiddle,indexOfMiddle+1,
                String.valueOf(stringBuilder.charAt(indexOfMiddle)).toUpperCase());

        return stringBuilder.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        Integer indexOfMiddle = str.length() / 2;
        stringBuilder.replace( indexOfMiddle,indexOfMiddle+1,
                String.valueOf(stringBuilder.charAt(indexOfMiddle)).toLowerCase());

        return stringBuilder.toString();
    }

    public static Boolean isIsogram(String str) {
        Map<String, Long> x = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (Long l : x.values()) {
            if (l > 1){
                return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2)) ){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder strBui = new StringBuilder();
        strBui.append(str);
        int index = 0;
        for (int i = 0; i < strBui.length()-2; i++) {
            if (strBui.charAt(i) == strBui.charAt(i + 1)){
                strBui.delete(i, i + 2);
                index++;
            }
        }
        return strBui.toString();
    }

    public static String invertCasing(String str) {
        StringBuilder strBui = new StringBuilder();
        Character[] strArray = Arrays.stream(str.split(""))
                .map(s -> s.charAt(0))
                .toArray(Character[]::new);
        for (Character c : strArray) {
            strBui.append( Character.isUpperCase(c)
                    ? c.toString().toLowerCase()
                    : c.toString().toUpperCase() );
        }
        return strBui.toString();
    }
}