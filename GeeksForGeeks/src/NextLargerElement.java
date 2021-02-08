import java.util.ArrayList;
import java.util.List;

public class NextLargerElement {

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4};
        findNextLargest(arr);

        arr = new int[] {4, 3, 2, 1};
        findNextLargest(arr);
    }

    private static void findNextLargest(int[] arr) {

        List<Integer> nextLargerElements = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) { // 1 3 2 4
            boolean found = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    found = true;
                    nextLargerElements.add(arr[j]);
                    break;
                }
            }

            if (!found) {
                nextLargerElements.add(-1);
            }
        }

        nextLargerElements.add(-1);

        nextLargerElements.forEach(nextLarger -> System.out.print(nextLarger + " "));
        System.out.println();
    }
}
