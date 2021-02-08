import java.util.ArrayList;
import java.util.List;

public class MaximumOfAllSubarraysOfSizeK {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        findMaximumOfAllSubarraysOfSize(arr, 3);

        System.out.println();

        arr = new int[] {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        findMaximumOfAllSubarraysOfSize(arr, 4);
    }

    private static void findMaximumOfAllSubarraysOfSize(int[] arr, int number) {
        List<Integer> finalArray = new ArrayList<Integer>();

        for (int i = 0; i < (arr.length - number) + 1; i++) {
            int max = -1;
            for (int j = 0; j < number; j++) {
                if (max < arr[i + j]) {
                    max = arr[i + j];
                }
            }
            finalArray.add(max);
        }

        finalArray.stream().forEach(element -> System.out.print(element + " "));
    }
}
