package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        int middle = string.length()/2;
        return string.charAt(middle);
    }

    public static String capitalizeMiddleCharacter(String str) {
        StringBuilder sbr = new StringBuilder();
        Character s = getMiddleCharacter(str);
        int index = str.length()/2;
        for(int i=0;i<str.length();i++)
        {
            if(index==i){
                s = Character.toUpperCase(s);
                sbr.append(s);
            }
            else
            sbr.append(str.charAt(i));
        }

        return sbr.toString();
    }

    public static String lowerCaseMiddleCharacter(String str) {

        StringBuilder sbr = new StringBuilder();
        Character s = getMiddleCharacter(str);
        int index = str.length()/2;
        for(int i=0;i<str.length();i++)
        {
            if(index==i){
                s = Character.toLowerCase(s);
                sbr.append(s);
            }
            else
                sbr.append(str.charAt(i));
        }

        return sbr.toString();
    }

    public static Boolean isIsogram(String str) {

        str = str.toLowerCase();
        str = str.replaceAll(" ","");

        char[] arr = str.toCharArray();
        Boolean returnValue=true;

        Map<Character, Integer> words = new HashMap<>();
        for(Character c:arr){
            if(words.containsKey(c)){
                words.put(c, 1+words.get(c));
            }
            else{
                words.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer>entry : words.entrySet()){
            if(entry.getValue()>1)
                return false;

        }
        return returnValue;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char [] evaluate= str.toCharArray();
        Boolean returnValue=false;
        for(int i=0;i<evaluate.length-1;i++){
            if(evaluate[i]==evaluate[i+1])
                return true;
        }
        return returnValue;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        char [] evaluate= str.toCharArray();
        char prev = '\0';
        int k = 0;
        for(int i =0; i<evaluate.length;i++)
        {
            if(prev!=evaluate[i]){
                evaluate[k++]=evaluate[i];
                prev=evaluate[i];
            }
        }
        return new String(evaluate).substring(0,k);
//
//        StringBuilder sbr = new StringBuilder();
//        for(int i=0;i<evaluate.length-1;i++){
//            if(!(evaluate[i]==evaluate[i+1])){
//                sbr.append(evaluate[i]);
//            }
//        }
//        return sbr.toString();
    }

    public static String invertCasing(String str) {
        String newText = str.chars()
                .mapToObj(ch -> Character.isLowerCase(ch) ? String.valueOf(Character.toUpperCase((char)ch)) : String.valueOf(Character.toLowerCase((char)ch)))
                .collect(Collectors.joining());
        return newText;
    }
}