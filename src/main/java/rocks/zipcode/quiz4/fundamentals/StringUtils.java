package rocks.zipcode.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        int middle = str.length() / 2;
        return str.substring(0,middle)+ Character.toUpperCase(getMiddleCharacter(str)) + str.substring(middle + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int middle = str.length() / 2;
        return str.substring(0,middle)+ Character.toLowerCase(getMiddleCharacter(str)) + str.substring(middle + 1);
    }

    public static Boolean isIsogram(String str) {
        Set result = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            result.add(str.charAt(i));
        }
        return str.length() == result.size();
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 1; i < str.length() ; i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {

        String result = "";
        int index = 0;
        for (int i = 1; i < str.length() ; i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                result += str.substring(index, i-1);
                index = 1 + i;
            }
        }
        result += str.substring(index);
        return result;

    }

    public static String invertCasing(String str) {
        String[] arr = str.split("");
        String result = "";
        for (String s : arr){
            if(Character.isUpperCase(s.charAt(0))){
                result += s.toLowerCase();
            } else{
               result += s.toUpperCase();
            }
        }
        return result;
    }

}