package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {

        return str.substring(0,str.length()/2) + getMiddleCharacter(str.toUpperCase()) + str.substring((str.length()/2)+1);
    }

    public static String lowerCaseMiddleCharacter(String str) {

        return str.substring(0,str.length()/2) + getMiddleCharacter(str.toLowerCase()) + str.substring((str.length()/2)+1);
    }

    public static Boolean isIsogram(String str) {

        char[] element = str.toCharArray();
        for(int i = 0; i < element.length; i++){
            for (int j = i+1; j < element.length;j++){
                if (element[i] == element[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {

        char[] element = str.toCharArray();
        for (int i = 0;i < element.length-1;i++){
            if (element[i] == element[i+1]){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {

        for(int i = 0; i < str.length()-1; i++){
            if (str.charAt(i) == str.charAt(i+1)){
                str = str.substring(0,i)+ str.substring(i+2);
            }
        }
        return str;
    }

    public static String invertCasing(String str) {

        char[] element = str.toCharArray();
        for(int i = 0; i < element.length; i++) {
            if(Character.isLowerCase(element[i])) {
                element[i] = Character.toUpperCase(element[i]);
            }
            else {
                element[i] = Character.toLowerCase(element[i]);
            }
        }
        return String.valueOf(element);
    }
}