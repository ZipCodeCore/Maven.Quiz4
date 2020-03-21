package rocks.zipcode.quiz4.fundamentals;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        Integer middle = string.length()/2;
        return string.charAt(middle);
    }

    public static String capitalizeMiddleCharacter(String str) {
        Integer middle = str.length()/2;
        return str.substring(0,middle) + getMiddleCharacter(str).toString().toUpperCase() + str.substring(middle+1);
    }

    public static String lowerCaseMiddleCharacter(String str) {
        Integer middle = str.length()/2;
        return str.substring(0,middle) + getMiddleCharacter(str).toString().toLowerCase() + str.substring(middle+1);
    }

    public static Boolean isIsogram(String str) {
        String[] array = str.split("");
        List<String> list = Stream.of(array).distinct().collect(Collectors.toList());
        return list.size() == str.length();
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        String normalize = str.toLowerCase();
        for(int i =0; i < normalize.length()-1;i++){
            if(normalize.charAt(i) == normalize.charAt(i+1)){
                return true;
            }
        }
        return false;
    }

    //TODO: return to create a better solution. This is TOO LONG!
    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        String normalize = str.toLowerCase();
        for(int i =0; i < normalize.length()-1;i++) {
            if(normalize.charAt(i) != normalize.charAt(i+1)) {
                sb.append(str.charAt(i));
            }else{
                i++;
            }
        }
        if(normalize.charAt(str.length()-1) != normalize.charAt(str.length()-2)){
            sb.append(str.charAt(str.length()-1));
        }
        return sb.toString();
    }

    public static String invertCasing(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            String comparison = String.valueOf(str.charAt(i)).toLowerCase();
            String original = String.valueOf(str.charAt(i));
            if(comparison.equals(original)){
                sb.append(original.toUpperCase());
            }else{
                sb.append(original.toLowerCase());
            }
        }
        return sb.toString();
    }
}