package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        String answer = getMiddleChar(string);
        return answer.charAt(0);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String middleChar = getMiddleChar(str).toUpperCase();
        return returnString(str, middleChar);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String middleChar = getMiddleChar(str).toLowerCase();
        return returnString(str, middleChar);
    }

    public static Boolean isIsogram(String str) {
        int counter = 0;
        Character index;
        Boolean answer = true;
        for (int i = 0; i < str.length(); i++) {
            index = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                Character index2 = str.charAt(j);
                if (index.toString().equals(index2.toString())){
                    counter++;
                }
            }
            if (counter >= 1){
                answer = false;
            }
        }
        return answer;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String answer = "";
        if (!hasDuplicateConsecutiveCharacters(str)) {
            return str;
        } else {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)){
                    answer = str.substring(0, i) + str.substring(i + 2);
                }
            }
        }
        return answer;
    }

    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

    private static String getMiddleChar(String string) {
        int position;
        int length;
        if (string.length() % 2 == 0) {
            position = string.length() / 2 - 1;
            length = 2;
        } else {
            position = string.length() / 2;
            length = 1;
        }
        return string.substring(position, position + length);
    }

    private static String returnString(String str, String middleChar) {
        String beginning = str.substring(0, str.length() / 2);
        String ending = str.substring((str.length() / 2) + 1);
        return beginning + middleChar + ending;
    }
}