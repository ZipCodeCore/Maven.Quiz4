package rocks.zipcode.quiz4.fundamentals;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
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
        StringBuilder retString = new StringBuilder();
        AtomicInteger i = new AtomicInteger(0);
        str.chars().mapToObj(x -> (char)x).forEach(x -> {
            if((str.length()/2) == i.getAndIncrement())
                retString.append(x.toString().toUpperCase());
            else
                retString.append(x);
        });
        return retString.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        StringBuilder retString = new StringBuilder();
        AtomicInteger i = new AtomicInteger(0);
        str.chars().mapToObj(x -> (char)x).forEach(x -> {
            if((str.length()/2) == i.getAndIncrement())
                retString.append(x.toString().toLowerCase());
            else
                retString.append(x);
        });
        return retString.toString();
    }

    public static Boolean isIsogram(String str) {
        StringBuilder sorted = new StringBuilder();
        str.chars().mapToObj(x -> (char)x).sorted().forEach(x -> sorted.append(x));
        for(int i = 1; i < sorted.length(); i++){
            if(sorted.charAt(i-1) == sorted.charAt(i))
                return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        StringBuilder retStr = new StringBuilder();
        str.chars().mapToObj(x -> (char)x).forEach(x -> retStr.append(x));
        for(int i = 1; i < retStr.length(); i++){
            if(retStr.charAt(i-1) == retStr.charAt(i))
                return true;
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder retStr = new StringBuilder();
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) != str.charAt(i+1))
                retStr.append(str.charAt(i));
            else {
                i++;
            }
        }
        retStr.append(str.charAt(str.length()-1));
        return retStr.toString();
    }

    public static String invertCasing(String str) {
        StringBuilder retStr = new StringBuilder();
        str.chars().mapToObj(x -> (char)x)
                .forEach(x -> {
                    String cha = x.toString();
                    if(cha.equals(cha.toUpperCase()))
                        retStr.append(cha.toLowerCase());
                    else
                        retStr.append(cha.toUpperCase());
                });
        return retStr.toString();
    }
}