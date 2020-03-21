package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {

        int pos = 0;
        int len = 0;
        String mid = "";
        if (str.length() % 2 == 0) {
            pos = str.length() / 2 - 1;
            len = 2;

        } else if (str.length() % 2 == 1) {
            pos = str.length() / 2;
            len = 1;
        }
        mid = str.substring(pos, pos + len);
        {


            return mid.toUpperCase();

        }
    }

    public static String lowerCaseMiddleCharacter(String str) {


        StringUtils.getMiddleCharacter(str);
        return str.toLowerCase();

    }

    public static Boolean isIsogram(String str) {
        str = str.toLowerCase();
        int len = str.length();
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) ;

            return false;
        }

        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        int len = str.length();
        char arr[] = str.toCharArray();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) ;

                return true;

            }

            return false;

        }
        return null;
    }

        public static String removeConsecutiveDuplicateCharacters (String str){
            return null;
        }

        public static String invertCasing (String str){

        char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if(Character.isUpperCase(c)){
                    chars[i] = Character.toLowerCase(c);
                }
                else if(Character.isLowerCase(c)){
                    chars [i] = Character.toUpperCase(c);
                }

            }

            return new String (chars);
        }
    }
