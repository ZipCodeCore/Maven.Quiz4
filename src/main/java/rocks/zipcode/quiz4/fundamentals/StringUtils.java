package rocks.zipcode.quiz4.fundamentals;


/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        int mid = string.length()/2;
        return string.charAt(mid);
    }

    public static String capitalizeMiddleCharacter(String str) {


        return str.substring(0, str.length()/2) + Character.toUpperCase(getMiddleCharacter(str)) + str.substring(str.length()/2 + 1);


    }


    public static String lowerCaseMiddleCharacter(String str) {


        return str.substring(0, str.length()/2) + Character.toLowerCase(getMiddleCharacter(str)) + str.substring(str.length()/2 + 1);


    }

    public static Boolean isIsogram(String str) {
        return str.length() == str.chars().distinct().count();

    }


    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
     Boolean flag = false;

        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                flag = true;
            }
        }

        return flag;


    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        StringBuilder builder = new StringBuilder();

        if(hasDuplicateConsecutiveCharacters(str)) {
            int index;
            builder.append(str.charAt(0));
            for (int i = 1; i <str.length()-1 ; i++) {
                char prev = str.charAt(i-1);
                char next = str.charAt(i+1);

                if(str.charAt(i) != prev && str.charAt(i) != next){
                    builder.append(str.charAt(i));
                }

            }
            builder.append(str.charAt(str.length()-1));

        }
        else{
            return str;
        }

        return builder.toString();

    }






    public static String invertCasing(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += Character.toLowerCase(c);
            }
        }

        return result;
    }


}