import java.util.regex.Pattern;

class Solution2 {
    public String disemvowel(String str) {
        //My solution
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!isVowel(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    private static boolean isVowel(char charAt) {
        return charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u' || charAt == 'A' || charAt == 'E' || charAt == 'I' || charAt == 'O' || charAt == 'U';
    }

    //Best solution
     public static String disemvowel2(String Z) {
         return Z.replaceAll("(?i)[aeiou]" , "");
     }

    public static String disemvowel3(String str) {
        return str.replaceAll("(?i)[aeiou]","");
    }

    public static String disemvowel4(String str) {
        return str.replaceAll("(?i)[AEIOU]", "");
    }

    private static final Pattern pattern = Pattern.compile("(?i)[aeiou]");
    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        for(int i = 0; i < str.length(); i++){
            if(pattern.matcher(str).matches()){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }


    //last solution
    /**
      * Pre compiled pattern to match all vowels in a given string.
      */
     private static final Pattern DISEMVOWEL_PATTERN = Pattern.compile("[AaEeIiOoUu]");

     /**
      * Remove all vowels from the given input string.
      *
      * @param str The string to remove vowels from.
      *
      * @return A copy of the original string with all vowels removed.
      */
     public static String disemvowel5(String str) {
         return DISEMVOWEL_PATTERN.matcher(str).replaceAll("");
     }
 }

public class DisemvowelTrolls{
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.disemvowel("This website is for losers LOL!"));
    }
}
