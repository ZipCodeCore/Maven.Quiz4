package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        char[] charskis = string.toCharArray();
        Character mid;
        for(int i = 0; i < charskis.length;i++){
            if(charskis.length%2!=0){
                return Character.valueOf(charskis[charskis.length/2]);
            }
        }
        return null;
    }

    public static String capitalizeMiddleCharacter(String str) {
        char[] charmander = str.toCharArray();
        String result = "";
        for(int i = 0; i < charmander.length; i++){
            while(charmander.length%2!=0){
                result += Character.toUpperCase(charmander[charmander.length/2]);
                break;
            }
            result += charmander[i];
        }
        return result;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return null;
    }

    public static Boolean isIsogram(String str) {
        char[] charmeleon = str.toCharArray();
        for(int i = 0; i < charmeleon.length; i++){
            for (int j = i + 1; j < charmeleon.length; j++){
                if (charmeleon[i] == charmeleon[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] charmeleon = str.toCharArray();
        for(int i = 0; i < charmeleon.length - 1; i++){
                if (charmeleon[i] == charmeleon[i + 1]){
                    return true;
                }

        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String what = "";
        char[] charizard = str.toCharArray();
        for(int i = 1; i < charizard.length - 1; i++) {
            if (charizard[i] != charizard[i + 1]) {
                what = what + charizard[i];
            } else
                i++;
        }
        return what;
    }


    public static String invertCasing(String str) {
        return null;
    }
}