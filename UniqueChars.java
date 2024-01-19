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

            // #feedback: use better name
            char currentChar = str.charAt(i);

            // #feedback: you could done it with one condition
            // #feedback: why did you use this? you already hold the currentChar
            if ((currentChar == ' ') || (newString.indexOf(currentChar) == -1)) {

                  newString += char1;     

            }
        }
        
        return newString;
    }
}
