package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.toCharArray()[string.length()/2];
    }

    public static String capitalizeMiddleCharacter(String str) {
        char[] letters = str.toCharArray();
        letters[letters.length/2] = getMiddleCharacter(str).toString().toUpperCase().toCharArray()[0];
        String result = "";
        for(char letter : letters){
            result += letter;
        }
        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        char[] letters = str.toCharArray();
        letters[letters.length/2] = getMiddleCharacter(str).toString().toLowerCase().toCharArray()[0];
        String result = "";
        for(char letter : letters){
            result += letter;
        }
        return result;
    }

    public static Boolean isIsogram(String str) {
        char[] letters = str.toCharArray();
        for(int i = 0;i < letters.length;i++){
            for (int j = i+1; j < letters.length;j++){
                if (letters[i] == letters[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] letters = str.toCharArray();
            for (int i = 0;i < letters.length-1;i++){
                if (letters[i] == letters[i+1]){
                    return true;
                }
            }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        int dupeCounter = 0;
        char[] letters = str.toCharArray();
        String result = "";
        for (int i = 0;i< letters.length-1;i++){
            int j = i+1;
            dupeCounter = 0;
            while (letters[i]==letters[j] && j < letters.length) {
                dupeCounter++;
                j++;
            }
            if (dupeCounter > 0){
                for (int d = i; d <= i+dupeCounter; d++){
                    letters[d] = '5';
                }
            }
        }
        for (char letter : letters){
            if (letter!='5'){
                result += letter;
            }
        }
        return result;
    }

    public static char caseChar(char chr){
        if (Character.isLowerCase(chr)){
            return String.valueOf(chr).toUpperCase().charAt(0);
        } else {
            return String.valueOf(chr).toLowerCase().charAt(0);
        }

    }
    public static String invertCasing(String str) {
        char[] letters = str.toCharArray();
        String result = "";
        for(char letter : letters){
            result += caseChar(letter);
        }
        return result;
    }
}