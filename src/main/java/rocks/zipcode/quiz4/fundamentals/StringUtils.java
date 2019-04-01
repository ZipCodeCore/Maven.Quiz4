package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        int mid = string.length()/2;
        return string.charAt(mid);
    }

    public static String capitalizeMiddleCharacter(String str) {
        int stringLength = str.length() ;

        int middle = stringLength/2 ;

        char c = str.charAt(middle);
            char ch = Character.toUpperCase(c);

        return String.valueOf(ch);
    }

    public static String lowerCaseMiddleCharacter(String str) {


        int middle = str.length()/2 ;

        char c = str.charAt(middle);
        char ch = Character.toLowerCase(c);

        return String.valueOf(ch);
    }

    public static Boolean isIsogram(String str) {

        str = str.toLowerCase();
        int len = str.length();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }


    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        if(str.length()<2) {
            return true;
        }else
        return false;


    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return str.replaceAll("(.)(?=\\1)", "");
    }






    public static String invertCasing(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }
        }

        return result;
    }


}