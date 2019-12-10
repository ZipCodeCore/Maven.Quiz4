package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {

    public static Integer getMiddleIndexOfString(String string){
        return string.length()/2;
    }

    public static Character getMiddleCharacter(String string) {
        return string.charAt(getMiddleIndexOfString(string));
    }

    public static String capitalizeMiddleCharacter(String str) {
        Integer middleIndex = getMiddleIndexOfString(str);
        return str.substring(0,middleIndex) +
                str.substring(middleIndex, middleIndex+1).toUpperCase() +
                str.substring(middleIndex+1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        Integer middleIndex = getMiddleIndexOfString(str);
        return str.substring(0,middleIndex) +
                str.substring(middleIndex, middleIndex+1).toLowerCase() +
                str.substring(middleIndex+1);    }

    public static Boolean isIsogram(String str) {
        for(int i = 0; i < str.length()-1; i++){
            for(int j = i+1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length()-1; i++){
            if (str.charAt(i) == str.charAt(i+1)) return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String output = "";
        if (str.charAt(0) != str.charAt(1))output += str.charAt(0);
        for (int i = 1; i < str.length()-1; i++){
            if (str.charAt(i) != str.charAt(i+1) && str.charAt(i) != str.charAt(i-1)) output += str.charAt(i);
        }
        if (str.charAt(str.length()-1) != str.charAt(str.length()-2)) output += str.charAt(str.length()-1);
        return output;
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (Character.isUpperCase(chars[i])) chars[i] = Character.toLowerCase(chars[i]);
            else if (Character.isLowerCase(chars[i])) chars[i] = Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}