/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) { 
        
        String str = args[0];

        System.out.println(lowerCase(str));
    }
   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String str) {

        String newString = "";

        for (int i = 0 ; i < str.length() ; i++) {

            int strNew = str.charAt(i);

            if (65 <= strNew && strNew <= 90 ) {

                strNew = strNew + 32;

                newString = newString + (char) strNew;

            } else {

                newString = newString + str.charAt(i);
            } 
        }

        return newString;
    }
}
