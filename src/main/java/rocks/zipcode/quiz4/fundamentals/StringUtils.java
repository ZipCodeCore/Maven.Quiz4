package rocks.zipcode.quiz4.fundamentals;

import java.util.HashSet;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        int position;
        int length;
        if (string.length() % 2 == 0)
        {
            position = string.length() / 2 - 1;
            length = 2;
        }
        else {
            position = string.length() / 2;
            length = 1;
        }
        return string.charAt(position);

    }

    public static String capitalizeMiddleCharacter(String str) {
        int index = str.length()/2;
        return str.substring(0, index) + ((Character)str.charAt(index)).toString().toUpperCase() + str.substring(index + 1);

    }

    public static String lowerCaseMiddleCharacter(String str) {
        int index = str.length() / 2;
        return str.substring(0, index) + ((Character) str.charAt(index)).toString().toLowerCase() + str.substring(index + 1);
    }

    public static Boolean isIsogram(String str) {
        HashSet<Character> chara = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(!chara.add(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        if (str.length() > 1) {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {

        String string = "";
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isLowerCase(c)) {
                string += Character.toUpperCase(c);
            } else {
                string += Character.toLowerCase(c);
            }
        }

        return string;
    }
}