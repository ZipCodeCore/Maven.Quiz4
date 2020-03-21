package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string)

    {

        char[] charr= string.toCharArray();

        return charr[charr.length/2];
    }

    public static String capitalizeMiddleCharacter(String str)

    {

        char[] charr= str.toCharArray();


        StringBuffer strbuff=new StringBuffer(str);
        strbuff.setCharAt(charr.length/2, Character.toUpperCase(strbuff.charAt(charr.length/2)));


     return  strbuff.toString();

    }

    public static String lowerCaseMiddleCharacter(String str)

    {
        char[] charr= str.toCharArray();


        StringBuffer strbuff=new StringBuffer(str);
        strbuff.setCharAt(charr.length/2, Character.toLowerCase(strbuff.charAt(charr.length/2)));


        return  strbuff.toString();
    }

    public static Boolean isIsogram(String str) {

        str = str.toLowerCase();
        int len = str.length();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }




    public static Boolean hasDuplicateConsecutiveCharacters(String str)

    {
        return (str.matches(".*(.)\\1.*"));
    }

    public static String removeConsecutiveDuplicateCharacters(String str){

   return str.replaceAll("(.)\\1{1,}", "$1");
    }

    public static String invertCasing(String str) {

        String t = "";
        for (int x = 0; x < str.length(); x++)
        {
            char c = str.charAt(x);
            boolean check = Character.isUpperCase(c);
            if (check == true)
                t = t + Character.toLowerCase(c);
            else
                t = t + Character.toUpperCase(c);
        }
       return t;
    }

}