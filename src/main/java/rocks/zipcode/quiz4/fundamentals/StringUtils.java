package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        if (string.length() % 2 == 0){
            return string.charAt((string.length()/2)-1);
        }else {
            return string.charAt(string.length()/2);
        }
    }

    public static String capitalizeMiddleCharacter(String str) {
        String result = "";
        result = getMiddleCharacter(str).toString().toUpperCase();

        return str.substring(0, str.length()/2) + result + str.substring((str.length()/2 +1));
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return null;
    }

    public static Boolean isIsogram(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1))
                    return true;
            }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {


        return null;
    }

    public static String invertCasing(String str) {
        return null;
    }
}