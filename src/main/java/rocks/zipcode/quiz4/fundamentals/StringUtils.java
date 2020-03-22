package rocks.zipcode.quiz4.fundamentals;


/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length() / 2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        return str.substring(0, str.length() / 2) +
                getMiddleCharacter(str.toUpperCase()) + str.substring(str.length() / 2 + 1);

    }

    public static String lowerCaseMiddleCharacter(String str) {
        return str.substring(0, (str.length() / 2))+
         getMiddleCharacter(str.toLowerCase()) + str.substring(str.length() / 2+1);
    }

    public static Boolean isIsogram(String str) {

        for( int i =1; i<str.length(); i++){
            char c = str.charAt(i);
            if(str.indexOf(c)!=i){
                return false;
            }
        }
        return true;
    }


    public static Boolean hasDuplicateConsecutiveCharacters(String str) {


        for(int i =1; i<str.length();i++){
            if(str.charAt(i)== str.charAt(i-1)){
                  return true;
            }
        }
        return false;
    }





    public static String removeConsecutiveDuplicateCharacters(String str) {
        for(int i = 0; i< str.length()-1; i++){
            if (str.charAt(i)==str.charAt(i+1)){
                str= str.substring(0,i)+ str.substring(i+2);
            }
        }
        return str;
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