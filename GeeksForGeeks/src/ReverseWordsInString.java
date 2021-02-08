import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {

    public static void main(String[] args) {

        String str = "Java is best";
        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);

        StringBuffer sb = new StringBuffer();
        for (String word : words) {
            sb.append(word);
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
