package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String newString = str.substring(0, str.length()/2);
        newString += Character.toUpperCase(getMiddleCharacter(str));
        newString += str.substring((str.length()/2)+1);

        return newString;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String newString = str.substring(0, str.length()/2);
        newString += Character.toLowerCase(getMiddleCharacter(str));
        newString += str.substring((str.length()/2)+1);

        return newString;
    }

    public static Boolean isIsogram(String str) {
        for (char c : str.toCharArray()) {
            if(getNumberOfOccurrencies(str, c) > 1) {
                return false;
            }
        }
        return true;
    }

    private static int getNumberOfOccurrencies(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c){
                count++;
            }
        }
        return count;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length()-1 ; i++) {
            if(str.charAt(i) == str.charAt(i+1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        List<Character> charsToRemove = getConsecutiveCharacters(str);
        for (char c : charsToRemove) {
                str = str.replace(c+"", "");
        }

        return str;
    }

    private static ArrayList<Character> getConsecutiveCharacters(String str) {
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length()-1 ; i++) {
            if(str.charAt(i) == str.charAt(i+1)){
                chars.add(str.charAt(i));
            }
        }
        return chars;
    }

    public static String invertCasing(String str) {
        String newString = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                newString += Character.toLowerCase(str.charAt(i));
            }
            else {
                newString += Character.toUpperCase(str.charAt(i));
            }
        }

        return newString;
    }
}