package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        int middle = string.length()/2;
        return string.charAt(middle);
    }

    public static String capitalizeMiddleCharacter(String str) {
        int middle = str.length()/2;
        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(i == middle)
                result += Character.toUpperCase(str.charAt(i));
            else
                result += str.charAt(i);
        }

        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int middle = str.length()/2;
        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(i == middle)
                result += Character.toLowerCase(str.charAt(i));
            else
                result += str.charAt(i);
        }

        return result;
    }

    public static Boolean isIsogram(String str) {
        char[] array = str.toCharArray();
        Arrays.sort(array);

        for(int i = 1; i < array.length; i++)
            if (array[i] == array[i - 1])
                return false;

        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] array = str.toCharArray();

        for(int i = 1; i < array.length; i++)
            if (array[i] == array[i - 1])
                return true;

        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String result = "";
        char[] array = str.toCharArray();

        for(int i = 0; i < array.length-1; i++)
            if (array[i] != array[i + 1])
                result += array[i];
            else
                i = i + 1;

        if(array[array.length - 2] != array[array.length - 1])
            result += array[array.length - 1];

        return result;
    }

    public static String invertCasing(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++)
            if(Character.isUpperCase(str.charAt(i)))
                result += Character.toLowerCase(str.charAt(i));
            else
                result += Character.toUpperCase(str.charAt(i));

        return result;
    }
}