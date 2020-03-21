package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return  string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(str.length()/2, Character.toUpperCase(getMiddleCharacter(str)));
        return sb.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(str.length()/2, Character.toLowerCase(getMiddleCharacter(str)));
        return sb.toString();
    }

    public static Boolean isIsogram(String str) {
        return stringToCharList(str).stream().allMatch(new HashSet<>()::add);
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return (str.matches(".*(.)\\1.*"));
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder(str);
            int count = 0;
            while (count < sb.length() -1){
                if(sb.charAt(count) == sb.charAt(count+1)){
                    sb.deleteCharAt(count);
                    sb.deleteCharAt(count);
                }
                count+=1;
            }
           return sb.toString();

    }

    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder();
        for (Character c : stringToCharList(str)){
            if(Character.toUpperCase(c) == c){
                c = Character.toLowerCase(c);
            }
            else {
                c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static List<Character> stringToCharList(String s){
        return s.chars().mapToObj((i) -> (char) i).collect(Collectors.toList());
    }

}