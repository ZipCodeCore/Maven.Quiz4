package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return str.substring(0, str.length()/2) + String.valueOf(Character.toUpperCase(getMiddleCharacter(str))) +
                str.substring(str.length()/2 + 1);

    }

    public static String lowerCaseMiddleCharacter(String str) {
        return str.substring(0, str.length()/2) + String.valueOf(Character.toLowerCase(getMiddleCharacter(str))) +
                str.substring(str.length()/2 + 1);
    }

    public static Integer frequency(String str, char toFind){
        Stream<Character> characterStream = str.chars()
                .mapToObj(c -> (char) c);
        List<Character> list =  characterStream
                .filter(value -> (char) value == toFind)
                .collect(Collectors.toList());
        return list.size();
    }
    public static Boolean isIsogram(String str) {
        Stream<Character> characterStream = str.chars()
                .mapToObj(c -> (char) c);
        List<Character> list =  characterStream
                    .filter(value -> frequency(str, (char)value) != 1)
                    .collect(Collectors.toList());
        return list.size()==0;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        boolean hasDuplicates = false;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i + 1))
            {
                hasDuplicates = true;
                break;
            }
        }
        return hasDuplicates;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String result = "";

        for(int i = 0; i < str.length();){
            char character = str.charAt(i);
            int j = i+ 1;
            for( ; j < str.length();j++){
                if(str.charAt(j) == character){
                    j++;
                }
                else
                    break;
            }
            if(j == i + 1)
                result += String.valueOf(character);
            i = j;
        }
//        if(str.charAt(str.length() - 2) != str.charAt(str.length() - 1))
//        {
//            result += String.valueOf(str.charAt(str.length() - 1));
//        }
        return result;

    }

    public static String invertCasing(String str) {
        return null;
    }
}