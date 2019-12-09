package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.replace(str.length() / 2, (str.length() / 2) + 1, getMiddleCharacter(str).toString().toUpperCase());
        return stringBuilder.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.replace(str.length() / 2, (str.length() / 2) + 1, getMiddleCharacter(str).toString().toLowerCase());
        return stringBuilder.toString();
    }

    public static Boolean isIsogram(String str) {
        Integer count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
        }
        if(count >= str.length()){
            return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder();

        if(str.charAt(0) != str.charAt(1)){
            sb.append(str.charAt(0));
        }
        for (int i = 1; i < str.length()-1; i++) {
            if(str.charAt(i) != str.charAt(i+1) && str.charAt(i) != str.charAt(i-1)){
                sb.append(str.charAt(i));

            }
        }

        if(str.charAt(str.length()-1) != str.charAt(str.length()-2)){
            sb.append(str.charAt(str.length()-1));
        }
        return sb.toString();
    }

    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                sb.append(Character.toLowerCase(str.charAt(i)));
            } else {
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return sb.toString();
    }

}