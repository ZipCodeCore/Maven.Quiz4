package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {

        char[] arr = str.toCharArray();
        int i = arr.length/2;
        arr[i]= Character.toUpperCase(arr[i]);
        String result = new String(arr);

        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        char[] arr = str.toCharArray();
        int i = arr.length/2;
        arr[i]= Character.toLowerCase(arr[i]);
        String result = new String(arr);

        return result;
    }

    public static Boolean isIsogram(String str) {
        //str = str.toLowerCase();
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        for(int i = 0; i < str.length()-1; i++){
            if(arr[i] == arr[i +1])
                return false;
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return (str.matches(".*(.)\\1.*"));
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String k = "";

        int i;

        for(i =1 ; i < str.length() ; i++ ){

            if(str.charAt(i) != str.charAt(i-1)) {

                k = k+ str.charAt(i-1);

            }

        }

        if(str.charAt(i-2) != str.charAt(i-1) || k.equals("")){

            k+= str.charAt(i-1) ;

        }
        return k;
    }

    public static String invertCasing(String str) {
        StringBuilder result = new StringBuilder((str.length()));
        for (char c :  str.toCharArray()){
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }else if(Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            }
            result.append(c);
        }
        return result.toString();
    }
}