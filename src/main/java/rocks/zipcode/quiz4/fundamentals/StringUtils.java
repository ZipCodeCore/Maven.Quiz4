package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt((string.length() - 1) / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == ((str.length() - 1) / 2)) {
                sb.append(str.toUpperCase().charAt(i));
            } else {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == ((str.length() - 1) / 2)) {
                sb.append(str.toLowerCase().charAt(i));
            } else {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        for(int i = 0; i<str.length(); i++){
            if(countInString(str, str.charAt(i)) > 1){
                return false;
            }
        }
        return true;
    }

    private static Integer countInString(String str, Character c){
        Integer retVal=0;
        for(Character ele: str.toCharArray()){
            if(ele.equals(c)){
                retVal++;
            }
        }
        return retVal;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        Boolean retVal = false;
        for(int i = 0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                retVal = true;
            }
        }
        return retVal;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                i++;
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }

    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder();

        for(Character c: str.toCharArray()){
            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }
            else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }
            else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}