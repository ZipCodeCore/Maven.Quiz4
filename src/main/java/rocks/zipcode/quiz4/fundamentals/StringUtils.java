package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {

        char[] arr = str.toCharArray();
        int i = arr.length/2;
        arr[i]= Character.toUpperCase(arr[0]);
        String result = new String(arr);

        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return null;
    }

    public static Boolean isIsogram(String str) {
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return null;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
        return null;
    }
}