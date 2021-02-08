import java.util.*;
import java.util.stream.Collectors;

public class FindAllPairsWithGivenSum {

    public static void main(String[] args) {

        findPairs(new int[] {1, 2, 4, 5, 7}, new int[] {5, 6, 3, 4, 8}, 9);
        System.out.println();
        findPairs(new int[] {0, 2}, new int[] {1, 3}, 3);

        System.out.println();
        findPairsOptimized(new int[] {1, 2, 4, 5, 7}, new int[] {5, 6, 3, 4, 8}, 9);
        System.out.println();
        findPairsOptimized(new int[] {0, 2}, new int[] {1, 3}, 3);
    }

    private static void findPairsOptimized(int[] arr1, int[] arr2, int sum) {
        Set<Integer> set2 = new HashSet<>(Arrays.stream(arr2).boxed().collect(Collectors.toSet()));

        Map<Integer, Integer> pairs = new HashMap<>();
        for (int ele1 : arr1) {
            if (set2.contains(sum - ele1)) {
                pairs.put(ele1, sum - ele1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
            System.out.print("(" + entry.getKey() + "," + entry.getValue() + ") ");
        }
    }

    private static void findPairs(int[] arr1, int[] arr2, int sum) {
        for (int ele1 : arr1) {
            for (int ele2 : arr2) {
                if (ele1 + ele2 == sum) {
                    System.out.print("(" + ele1 + "," + ele2 + ") ");
                }
            }
        }
    }
}
