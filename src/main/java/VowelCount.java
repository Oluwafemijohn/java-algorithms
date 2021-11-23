import java.util.regex.Pattern;

public class VowelCount {
    public static void main(String[] args) {
        SolutionVowelCount solutionVowelCount = new SolutionVowelCount();
        System.out.println(solutionVowelCount.countVowels("abracadabra"));
    }
}
class SolutionVowelCount{
    private static final Pattern DISEMVOWEL_PATTERN = Pattern.compile("(?i)[aeiou]");
    public int countVowels(String s){
        int vowelsCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(DISEMVOWEL_PATTERN.matcher(String.valueOf(s.charAt(i))).matches()){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }

    public static int getCount2(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

    public static int getCount3(String str) {
        return str.replaceAll("[^aeiou]","").length();
    }

    private boolean isVowel2(char c){
        return "aeiou".indexOf(c) != -1;
    }

    private boolean isVowel(char charAt) {
        return DISEMVOWEL_PATTERN.matcher(String.valueOf(charAt)).find();
    }
}
