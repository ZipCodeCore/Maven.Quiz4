package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        char middleChar = Character.toUpperCase(getMiddleCharacter(str));
        String word = str.substring(0,str.length()/2) + middleChar + (str.substring((str.length()/2)+1));
        return word;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        char middleChar = Character.toLowerCase(getMiddleCharacter(str));
        String word = str.substring(0,str.length()/2) + middleChar + (str.substring((str.length()/2)+1));
        return word;
    }

    public static Boolean isIsogram(String str) {
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < str.length()-1; i++) {
                if (arr[i] == arr[i+1]) {
                    return false;
                }
            }
            return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String noDup= "";
        for(int i=0; i<str.length()-1; i++) {
            if (hasDuplicateConsecutiveCharacters(str)) {
                noDup = str.replaceAll(Character.toString(str.charAt(i)),"");
            }else{
                return str;
            }
        }
        return noDup;
    }

    public static String invertCasing(String str) {
        String invertingCase = "";
        for(int i= 0; i < str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                invertingCase += Character.toUpperCase(str.charAt(i));
            }else{
                invertingCase += Character.toLowerCase(str.charAt(i));
            }
        }
        return invertingCase;
    }
}