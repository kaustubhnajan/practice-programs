import java.util.HashSet;
import java.util.Set;

public class TotalDecodingMessages {

    public static void main(String[] args) {
        decode("123".toCharArray());
        decode("2563".toCharArray());
    }

    private static void decode(char[] arr) {
        int count = 1;
        Set<Integer> combination = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int number = Integer.parseInt(arr[i] + "" + arr[i + 1]);
            if (!combination.contains(number) && number < 27) {
                count++;
            }
        }
        System.out.println(count);
    }
}
