/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) { 

        String str = args[0];

        System.out.println(uniqueChars(str));
    }
    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String str) {

        String newString = "";

        for (int i = 0 ; i < str.length() ; i++) {

            char char1 = str.charAt(i);

            if (char1 == ' ') {

                newString = newString + " ";

            } else if ((newString.indexOf(String.valueOf(char1)) == -1)) {

                  newString = newString + char1;     

            }
        }
        
        return newString;
    }
}
