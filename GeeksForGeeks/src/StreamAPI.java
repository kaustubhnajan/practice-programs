import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPI {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("abc", "def", "xyz"));

        list.add("pqrs");
        System.out.println(list.stream().allMatch(str -> str.length() == 3));

        System.out.println(list.stream().anyMatch(str -> str.equals("def")));
    }
}
