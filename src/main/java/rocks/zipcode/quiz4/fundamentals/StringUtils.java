package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return str.substring(0,str.length()/2) + str.substring(str.length()/2, str.length()/2 + 1).toUpperCase() + str.substring(str.length()/2 + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return str.substring(0,str.length()/2) + str.substring(str.length()/2, str.length()/2 + 1).toLowerCase() + str.substring(str.length()/2 + 1);
    }

    public static Boolean isIsogram(String str) {
        for(int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                newStr.append(str.charAt(i));
            } else {
                i++;
            }
        }
        if(str.charAt(str.length() - 1) != str.charAt(str.length() - 2)){
            newStr.append(str.charAt(str.length()-1));
        }
        return newStr.toString();
    }

    public static String invertCasing(String str) {
        String[] strArray = str.split("");
        StringBuilder sb = new StringBuilder();
        for(String s : strArray){
            if(Character.isLowerCase(s.charAt(0))){
                sb.append(s.toUpperCase());
            } else {
                sb.append(s.toLowerCase());
            }
        }
        return sb.toString();
    }
}