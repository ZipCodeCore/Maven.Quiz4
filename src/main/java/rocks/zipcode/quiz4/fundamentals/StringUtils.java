package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {

    public static Character getMiddleCharacter(String string) {
        int middle = string.length() / 2;
        return string.charAt(middle);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() / 2) {
                result = result.concat(String.valueOf(str.toUpperCase().charAt(i)));
            } else {
                result = result.concat(String.valueOf(str.charAt(i)));
            }
        }

        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() / 2) {
                result = result.concat(String.valueOf(str.toLowerCase().charAt(i)));
            } else {
                result = result.concat(String.valueOf(str.charAt(i)));
            }
        }

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
        String[] temp = str.split("");
        String result = "";

        for (int i = 0; i < temp.length; i++) {
            if (temp[i].toUpperCase().equals(temp[i])) {
                temp[i] = temp[i].toLowerCase();
                result = result.concat(temp[i]);
            } else if (temp[i].toLowerCase().equals(temp[i])) {
                temp[i] = temp[i].toUpperCase();
                result = result.concat(temp[i]);
            } else {
                result = result.concat(temp[i]);
            }
        }

        return result;
    }
}