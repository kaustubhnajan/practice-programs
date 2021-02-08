import java.util.Arrays;
import java.util.List;

public class ReverseWordsInGivenString {

    public static void main(String[] args) {
        reverseString("i.like.this.program.very.much");
        reverseString("pqr.mno");
    }

    private static void reverseString(String str) {
        List<String> words = Arrays.asList(str.split("\\."));
        String finalString = "";
        for (int i = words.size() - 1; i >= 0; i--) {
            finalString += words.get(i) + ".";
        }
        System.out.println(finalString.substring(0, finalString.length() - 1));
    }
}
