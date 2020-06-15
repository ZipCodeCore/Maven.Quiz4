package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        Character getMiddleChar = string.charAt(string.length() / 2);
        return getMiddleChar;
    }

    public static String capitalizeMiddleCharacter(String str) {
        int middleIndex = str.length() / 2;
        String prefix = str.substring(0, middleIndex);
        String body = getMiddleCharacter(str).toString();
        String suffix = str.substring(middleIndex + 1);
            return prefix + body.toUpperCase() + suffix;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int middleChar = str.length() / 2;
        String prefix = str.substring(0, middleChar);
        String body = getMiddleCharacter(str).toString();
        String suffix = str.substring(middleChar + 1);
        return prefix + body.toLowerCase() + suffix;

    }

    public static Boolean isIsogram(String str) {
       String[] array = str.split("");
       List<String> list = Arrays.asList(array);
       Set<String> stringSet = new HashSet<>(list);
       return stringSet.size() == str.length();
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
      char[] charArray = str.toCharArray();

        for (int i = 1; i < charArray.length; i++) {
            char currentCharacter = charArray[i];
            char prevChar = charArray[i - 1];

            if (currentCharacter == prevChar) {
                return true;
            }
        }
            return false;

}
    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder();

        char[] array = str.toCharArray();
        for (int currentIndex = 0; currentIndex < array.length - 1; currentIndex++) {
            char currentCharacter = array[currentIndex];
            char nextCharacter = array[currentIndex + 1];
            if (currentCharacter != nextCharacter) {
                sb.append(currentCharacter);
            } else {
                currentIndex++;
            }

        }
        int lastIndex = str.length() - 1;
        int secondToLastIndex = str.length() - 2;
        Character lastChar = str.charAt(lastIndex);
        Character secondToLastChar = str.charAt(secondToLastIndex);

        if(lastChar != secondToLastChar){
           sb.append(lastChar) ;
        }
        return sb.toString();
        }


    public static String invertCasing(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if (Character.isUpperCase(c))
            {
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}

