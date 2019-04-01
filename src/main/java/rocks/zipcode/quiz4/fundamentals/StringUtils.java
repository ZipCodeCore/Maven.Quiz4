package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {

        String result = "";
        String prefix = str.substring(0, str.length()/2);
        String toCapitalize = getMiddleCharacter(str).toString().toUpperCase();
        String suffix = str.substring((str.length()/2)+1);
        result = prefix+toCapitalize+suffix;
        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {

        String result = "";
        String prefix = str.substring(0, str.length()/2);
        String toCapitalize = getMiddleCharacter(str).toString().toLowerCase();
        String suffix = str.substring((str.length()/2)+1);
        result = prefix+toCapitalize+suffix;
        return result;
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

        for(int i =0; i<str.length();i++) {
            if (Character.isUpperCase(str.charAt(i))){

            }
        }

        return null;
    }
}