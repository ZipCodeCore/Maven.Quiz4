package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        char middleChar = string.charAt(string.length()/2);
        return middleChar;
    }

    public static String capitalizeMiddleCharacter(String str) {
        return getMiddleCharacter(str).toString().toUpperCase();
    }

    public static String lowerCaseMiddleCharacter(String str) {
        return getMiddleCharacter(str).toString().toLowerCase();
    }

    public static Boolean isIsogram(String str) {
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        char[] duplicateCharacters = str.toCharArray();
        char previousElement;
        for (int currentIndex = 1; currentIndex < duplicateCharacters.length; currentIndex++) {
             char currentElement = duplicateCharacters[currentIndex];
             previousElement = duplicateCharacters[currentIndex-1];
             if(previousElement == currentElement){
                 return true;
             }
        }
        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String result = "";
        char[] duplicateCharacters = str.toCharArray();
        for (int currentIndex = 0; currentIndex < duplicateCharacters.length; currentIndex++){
            char currentElement = duplicateCharacters[currentIndex];
            if(!hasDuplicateConsecutiveCharacters(str)){
                result += currentElement;
            }
        }
        return result;
    }

    public static String invertCasing(String str) {
       // String result = "";
       // Character[] invertedChar = str.toCharArray().toString().toUpperCase();
      //  Character lowerCaseFirstChar = str.toCharArray().toString().toLowerCase();
      //  for (int currentIndex = 0; currentIndex < invertedChar.length; currentIndex++) {
       //     char currentElement = invertedChar[currentIndex];
      //      if (currentElement == invertedChar[currentIndex+1]) {
         //   }
      //  }
       return null;
   }
}