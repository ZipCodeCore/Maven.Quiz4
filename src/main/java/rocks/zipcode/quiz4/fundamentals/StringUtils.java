package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        Integer middleIndex = str.length()/2;
        return str.substring(0,middleIndex) +
                str.substring(middleIndex, middleIndex+1).toUpperCase() +
                str.substring(middleIndex+1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        Integer middleIndex = str.length()/2;
        return str.substring(0,middleIndex) +
                str.substring(middleIndex, middleIndex+1).toLowerCase() +
                str.substring(middleIndex+1);
    }

    public static Boolean isIsogram(String str) {
        for(int i = 0; i < str.length()-1; i++){
            for(int j = i+1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length()-1; i++){
            if (str.charAt(i) == str.charAt(i+1)) return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        ArrayList<String> removed = new ArrayList<>();
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                String remove = str.substring(i, i+2);
                removed.add(remove);
            }
        }

        String newString = str;
        for (String s: removed) {
            newString = newString.replace(s, "");
        }

        return newString;
    }

    public static String invertCasing(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                newStr.append(Character.toLowerCase(str.charAt(i)));
            } else if(Character.isLowerCase(str.charAt(i))) {
                newStr.append(Character.toUpperCase(str.charAt(i)));
            } else {
                newStr.append(str.charAt(i));
            }
        }

        return newStr.toString();

    }
}