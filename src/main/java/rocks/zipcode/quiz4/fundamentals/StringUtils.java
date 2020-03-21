package rocks.zipcode.quiz4.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        String[] newArray = string.split("");
        Integer middle = newArray.length/2;
        return string.charAt(middle);
    }

    public static String capitalizeMiddleCharacter(String str) {
        String newString = "";
        String[] newArray = str.split("");
        Integer middle = newArray.length/2;
        int count = 0;
        for(String letter : newArray){
            if(count == middle){
                newString += getMiddleCharacter(str).toString().toUpperCase();
            }
            else{
                newString += letter;
            }
            count++;
        }
        return newString;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        String newString = "";
        String[] newArray = str.split("");
        Integer middle = newArray.length/2;
        int count = 0;
        for(String letter : newArray){
            if(count == middle){
                newString += getMiddleCharacter(str).toString().toLowerCase();
            }
            else{
                newString += letter;
            }
            count++;
        }
        return newString;
    }

    public static Boolean isIsogram(String str) {
        String[] newArray = str.split("");
        List<String> newArray2 = new ArrayList<String>();
        newArray2.addAll(Arrays.asList(newArray));
        for(int i = 0; i < newArray2.size(); i++){
            if(Collections.frequency(newArray2, newArray2.get(i)) > 1){
                return false;
            }
        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        String[] newArray = str.split("");
        for(int i = 0; i < newArray.length; i++){
            if( i == (newArray.length - 1)){
                break;
            }
            else if (newArray[i].equals(newArray[i + 1])){
                    return true;
                }
            }

        return false;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        String[] newArray = str.split("");
        String newString = "";
        for(int i = 0; i < newArray.length; i++){
            if(i == (newArray.length-1) && (newArray[newArray.length - 1] != newArray[newArray.length - 2])){
                newString += newArray[i];
            }
            else if(i == (newArray.length-1)){
                break;
            }
            else if(newArray[i].equals(newArray[i+1])){
                i++;
            }
            else if(!newArray[i].equals(newArray[i+1])){
                newString += newArray[i];
            }
        }

        return newString;
    }

    public static String invertCasing(String str) {
        String newString = "";
        String[] newArray = str.split("");
        for(int i = 0; i < newArray.length; i++){
            if(newArray[i].toUpperCase().equals(newArray[i])){
                newString += newArray[i].toLowerCase();
            }
            else{
                newString += newArray[i].toUpperCase();
            }
        }

        return newString;
    }
}