package rocks.zipcode.quiz4.fundamentals;


/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static Character capitalizeMiddleCharacter(String str) {
        return null;

    }

    public static String lowerCaseMiddleCharacter(String str) {
        return null;
    }

    public static Boolean isIsogram(String str) {
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return null;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
        char[] arr= str.toCharArray();
        int count =0;
        for(char x :arr){
            if(Character.isUpperCase(x)){
                arr[count] = Character.toLowerCase(x);
            }
            else{
                arr[count] = Character.toUpperCase(x);
            }
            count++;
        }
        return new String(arr);
    }
}