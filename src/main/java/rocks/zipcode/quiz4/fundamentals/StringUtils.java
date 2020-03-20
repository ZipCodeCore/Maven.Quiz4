package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
       return str.substring(0, str.length()/2) + Character.toUpperCase(str.charAt(str.length()/2)) + str.substring(str.length()/2 +1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return str.substring(0, str.length()/2) + Character.toLowerCase(str.charAt(str.length()/2)) + str.substring(str.length()/2 +1);
    }

    public static Boolean isIsogram(String str) {
        Boolean answer = true;
        char[] temp = str.toCharArray();
        for (char letter: temp) {
            if(getCount(temp, letter) > 1){
                answer = false;
            }
        }
        return answer;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] temp = str.toCharArray();
        for (int i = 0; i < str.length()-1; i++) {
            if(temp[i] == temp[i+1]){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder builder = new StringBuilder();
        char[] temp = str.toCharArray();
        System.out.println(temp);
        for (int i = 0; i < temp.length-1; i++) {
            if(temp[i] == temp[i+1]){
                i++;
            } else {
                builder.append(temp[i]);
            }
        }
        builder.append(temp[temp.length-1]);
        return builder.toString();
    }

    public static String invertCasing(String str) {
        char[] temp = str.toCharArray();
        for (int i = 0; i < temp.length ; i++) {
            if(Character.isUpperCase(temp[i])){
                temp[i] = Character.toLowerCase(temp[i]);
            } else {
                temp[i] = Character.toUpperCase(temp[i]);
            }
        }
        str = new String(temp);
        return str;
    }

    public static Integer getCount(char[] array, char letter){
        Integer count = 0;
        for (char currentLetter: array) {
            if(currentLetter == letter){
                count++;
            }
        }
        return count;
    }
}