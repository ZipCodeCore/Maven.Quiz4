package rocks.zipcode.quiz4.fundamentals;
import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder upc = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if(i==((str.length() - 1)/2)) {
                upc.append(str.toUpperCase().charAt(i));
            }
            else {
                upc.append(str.charAt(i));
            }
        }
        return upc.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder upc = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if(i==((str.length() - 1)/2)) {
                upc.append(str.toLowerCase().charAt(i));
            }
            else {
                upc.append(str.charAt(i));
            }
        }
        return upc.toString();
    }

    public static Boolean isIsogram(String str) {

        int len = str.length();
        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                i++;
            }
            else {
                sb.append(str.charAt(i));
            }
        }
        sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}