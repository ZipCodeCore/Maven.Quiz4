package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String newChar = getMiddleCharacter(str).toString().toUpperCase();
        return str.substring(0, str.length()/2) + newChar + str.substring((str.length()/2) + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String newChar = getMiddleCharacter(str).toString().toLowerCase();
        return str.substring(0, str.length()/2) + newChar + str.substring((str.length()/2) + 1);    }

    public static Boolean isIsogram(String str) {
        for(int i = 0; i < str.length(); i++){
            String s = ((Character) str.charAt(i)).toString();
            if(getNumberOfOccurrences(str, s) > 1){
                return false;
            }
        }
        return true;
    }

    public static Integer getNumberOfOccurrences(String str, Object objectToCount) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++){
            String s = ((Character) str.charAt(i)).toString();
            if (s.equals(objectToCount)){
                counter++;
            }
        }
        return counter;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i + 1)){
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i + 1)){
                str = str.substring(0, i) + str.substring(i + 2);
            }
        }
        return str;
    }

    public static String invertCasing(String str) {
        for(int i = 0; i < str.length(); i++){
            Character newChar = str.charAt(i);
            if(newChar > 64 && newChar < 91) newChar = (char) (newChar + 32);
            else if (newChar > 96 && newChar < 123) newChar = (char) (newChar - 32);
            str = str.substring(0,i) + newChar.toString() + str.substring(i + 1);
        }
        return str;
    }
}