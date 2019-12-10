package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return str.substring(0, str.length() / 2) + Character.toUpperCase(getMiddleCharacter(str)) + str.substring(str.length() / 2 + 1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return str.substring(0, str.length() / 2) + Character.toLowerCase(getMiddleCharacter(str)) + str.substring(str.length() / 2 + 1);
    }

    public static Boolean isIsogram(String str) {
        for (char c : str.toCharArray())
            if (!(str.chars().filter(ch -> ch == c).count() == 1))
                return false;

            return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        for (int i = 0; i < str.length() - 1; i++)
            if (str.charAt(i) == str.charAt(i + 1))
                return true;

        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length()-1; i++)
            if (str.charAt(i)==str.charAt(i+1))
                i++;
            else
                result.append(str.charAt(i));

        result.append(str.charAt(str.length()-1));

        return result.toString();
    }

    public static String invertCasing(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray())
            if (Character.isLowerCase(c))
                result.append(Character.toUpperCase(c));
            else if (Character.isUpperCase(c))
                result.append(Character.toLowerCase(c));
            else
                result.append(c);

        return result.toString();
    }
}