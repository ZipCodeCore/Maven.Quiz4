package rocks.zipcode.quiz4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() / 2) {
                answer += Character.toUpperCase(str.charAt(i));
            } else {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() / 2) {
                answer += Character.toLowerCase(str.charAt(i));
            } else {
                answer += str.charAt(i);
            }
        }
        return answer;
    }


    public static Boolean isIsogram(String str) {
        Set<Character> isogramChecker = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            isogramChecker.add(str.charAt(i));
        }
        return isogramChecker.size() == str.length();
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
        for (int i = 0; i < str.length() - 1; i++) {
            if (i == 0) {
                answer = "" + str.charAt(i);
            } else {
                if (str.charAt(i - 1) != str.charAt(i) && str.charAt(i + 1) != str.charAt(i)) {
                    answer = answer + str.charAt(i);
                }
            }
        }
        answer += str.charAt(str.length() - 1);

        return answer;
    }

    public static String invertCasing(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                answer += Character.toUpperCase(str.charAt(i));
            } else {
                answer += Character.toLowerCase(str.charAt(i));
            }
        }
        return answer;
    }
}