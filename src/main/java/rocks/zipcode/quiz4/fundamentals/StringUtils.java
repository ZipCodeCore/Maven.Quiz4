package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        int mid = string.length()/2;
        return string.charAt(mid);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String[] array = str.split("");
        String answer = "";
        for(int i = 0; i < array.length; i++){
            if(i == str.length()/2){
                answer+= getMiddleCharacter(str).toString().toUpperCase();
            }else{
                answer+= str.charAt(i);
            }
        }
        return answer;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String[] array = str.split("");
        String answer = "";
        for(int i = 0; i < array.length; i++){
            if(i == str.length()/2){
                answer+= getMiddleCharacter(str).toString().toLowerCase();
            }else{
                answer+= str.charAt(i);
            }
        }
        return answer;
    }

    public static Boolean isIsogram(String str) {

    Set<String> set = new TreeSet<>();

    Arrays.stream(str.split("")).forEach(string -> set.add(string));
    return set.size() == str.length();
    }



    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        String[] stringArray = str.split("");
        Boolean bool = false;
        String prev = stringArray[0];
        String answer = stringArray[0];

        for(int i =1; i < stringArray.length; i++){
            if(stringArray[i].equals(prev)){
             return true;
            } else {
                prev = stringArray[i];
            }
        }
        return bool;

    }

    public static String removeConsecutiveDuplicateCharacters(String str) {

        String[] stringArray = str.split("");
        String prev = stringArray[0];
        String answer = stringArray[0];

        for (int i = 1; i < stringArray.length - 1; i++) {
            if (!stringArray[i].equals(stringArray[i - 1]) && !stringArray[i].equals(stringArray[i + 1])) {
                answer += stringArray[i];
            }
        }

//        if(answer.substring(answer.length()-2) != stringArray[stringArray.length-1]){
//            answer+=stringArray[stringArray.length-1];
//        }
        return answer+stringArray[stringArray.length-1];
    }

    public static String invertCasing(String str) {
        String answer = "";

        for(int i = 0; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))){
                answer+= Character.toUpperCase(str.charAt(i));
            } else {
                answer+= Character.toLowerCase(str.charAt(i));
            }
        }
        return answer;
    }
}