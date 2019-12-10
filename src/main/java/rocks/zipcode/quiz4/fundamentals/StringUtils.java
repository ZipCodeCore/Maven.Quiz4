package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        int index = str.length() / 2;
        return str.substring(0, index) + Character.toUpperCase(getMiddleCharacter(str)) + str.substring(index + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int index = str.length() / 2;
        return str.substring(0, index)+ Character.toLowerCase(getMiddleCharacter(str)) + str.substring(index+1);
    }

    public static Boolean isIsogram(String str) {
        Integer count = 0;
        for(int i = 0; i < str.length(); i++){
            count++;
            for(int j = i + 1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if(count > 1)
                return false;
            count = 0;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int i = 1; i < str.length(); i++){
                if(str.charAt(i-1) == str.charAt(i))
                    return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)) {
                stringBuilder.replace(i - 1, i + 1, "");
            }
        }

        return stringBuilder.toString();
    }

    public static String invertCasing(String str) {
        String[] letters = str.split("");

        for(int i = 0; i < letters.length; i++){
            String temp = letters[i];
            if(temp.equals(temp.toUpperCase())){
                letters[i] = temp.toLowerCase();
            }else{
                letters[i] = temp.toUpperCase();
            }
        }
        return String.join("",letters);
    }
}