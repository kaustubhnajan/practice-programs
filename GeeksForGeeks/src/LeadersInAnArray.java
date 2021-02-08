import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};
        findAllLeaders(arr);

        arr = new int[] {1, 2, 3, 4, 0};
        findAllLeaders(arr);

        arr = new int[] {7, 4, 5, 7, 3};
        findAllLeaders(arr);
    }

    private static void findAllLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int leader = arr[i];

            if (i == arr.length - 1) {
                leaders.add(leader);
                break;
            }

            for (int j = i + 1; j <arr.length; j++) {
                if (leader < arr[j]) {
                    leader = -1;
                    break;
                }
            }

            if (leader != -1) {
                leaders.add(leader);
            }
        }

        leaders.forEach(leader -> System.out.print(leader + " "));
        System.out.println();
    }
}
