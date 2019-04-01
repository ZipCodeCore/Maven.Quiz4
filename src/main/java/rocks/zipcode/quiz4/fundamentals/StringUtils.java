package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        char[] stringToCharArray = string.toCharArray();
        int n=stringToCharArray.length;
        int mid;
        for (char output :stringToCharArray) {

            System.out.println(output);
        }
        if(n%2==0)
        {
            mid=n/2;
        }
        else mid=n/2;
        char c=stringToCharArray[mid];
       return c;

    }



    public static String capitalizeMiddleCharacter(String str) {
        char[] stringToCharArray = str.toCharArray();
        int n=stringToCharArray.length;
        int mid;
        for (char output :stringToCharArray) {

            System.out.println(output);
        }
        if(n%2==0)
        {
            mid=n/2;
        }
        else mid=n/2;

        String prefix = str.substring(0, mid);
        Character character = str.charAt(mid);
        String suffix = str.substring(mid+1);
        return prefix + character.toString().toUpperCase() + suffix;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        char[] stringToCharArray = str.toCharArray();
        int n=stringToCharArray.length;
        int mid;
        for (char output :stringToCharArray) {

            System.out.println(output);
        }
        if(n%2==0)
        {
            mid=n/2;
        }
        else mid=n/2;

        String prefix = str.substring(0, mid);
        Character character = str.charAt(mid);
        String suffix = str.substring(mid+1);
        return prefix + character.toString().toLowerCase() + suffix;
    }

    public static Boolean isIsogram(String str) {
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {

        char[] newChar = str.toCharArray();
        boolean flag=false;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(newChar[i]==newChar[j])
                    flag=true;
                else flag=false;
            }
        }
        return flag;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {

        String k="";
        int i;
        for( i =1 ; i < str.length() ; i++ ){

            if(str.charAt(i) != str.charAt(i-1)) {

                k = k+ str.charAt(i-1);

            }

        }

        if(str.charAt(i-2) != str.charAt(i-1) || k.equals("")){

            k+= str.charAt(i-1) ;

        }

        System.out.println(k) ;
        return k;
    }

    public static String invertCasing(String str) {
        char[] c=str.toCharArray();
        for(int i=0; i<c.length;i++)
        {
            c[i]=Character.isUpperCase(c[i])
                    ?Character.toLowerCase(c[i])
                    :Character.toUpperCase(c[i]);
        }
        return c.toString();
    }
}