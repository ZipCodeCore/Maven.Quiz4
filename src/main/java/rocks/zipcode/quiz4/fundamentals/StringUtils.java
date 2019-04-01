package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        return string.charAt(string.length()/2);
    }

    public static String capitalizeMiddleCharacter(String str) {
        Character middle = Character.toUpperCase(getMiddleCharacter(str));
        String replace = str.substring(0,str.length()/2)+
                middle+
                str.substring(str.length()/2+1);


        return replace;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        Character middle = Character.toLowerCase(getMiddleCharacter(str));
        String replace = str.substring(0,str.length()/2)+
                middle+
                str.substring(str.length()/2+1);
        return replace;
    }

    public static Boolean isIsogram(String str) {
        char char1 =str.charAt(0);
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==char1){
                count +=1;
                char1=str.charAt(i);
            }

        }
        System.out.println(count);
        return count==1;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i+1) == str.charAt(i)) {
                    count += 1;
                }
            }
        System.out.println(count);
        return count == 1;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {

        String newString = String.valueOf(str.charAt(0));
        for (int i = 0; i < str.length()-1; i++) {
            if(!newString.contains(String.valueOf(str.charAt(i+1)))) {
                newString += String.valueOf(str.charAt(i+1));

            }

        }return newString;
    }

    public static String invertCasing(String str) {
        String inverted = "";
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                inverted +=Character.toLowerCase(str.charAt(i));
            }else {
                inverted +=Character.toUpperCase(str.charAt(i));
            }
        }
        return inverted;
    }
}