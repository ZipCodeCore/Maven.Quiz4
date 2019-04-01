package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder(str);

        sb.setCharAt(str.length() / 2, Character.toUpperCase(getMiddleCharacter(str)));

        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {

        StringBuilder sb = new StringBuilder(str);

        sb.setCharAt(str.length() / 2, Character.toLowerCase(getMiddleCharacter(str)));

        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i+1; j < sb.length(); j++) {
                if(sb.charAt(i)==sb.charAt(j)){
                    return false;
                }
            }
        }

        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 1; i < sb.length(); i++) {
            if(sb.charAt(i)==sb.charAt(i-1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 1; i < sb.length(); i++) {
            if(sb.charAt(i)==sb.charAt(i-1)){
                sb.delete(i-1,i+1);
            }
        }

        return sb.toString();
    }

    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); i++) {
            if(Character.isUpperCase(sb.charAt(i))){
                sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
            }else{
                sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
            }
        }
        return sb.toString();
    }
}