package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        StringBuilder str = new StringBuilder(string);
        int half = str.length() / 2;

        return str.charAt(half);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder s = new StringBuilder(str);
        int half = str.length() / 2;

        s.replace(half, half, str.toUpperCase());

         Character c = str.charAt(half);
        // str.replace(half, c)


        return null;
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