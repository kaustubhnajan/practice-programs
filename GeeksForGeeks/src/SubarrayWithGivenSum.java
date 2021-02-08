import java.util.LinkedList;
import java.util.Queue;

public class SubarrayWithGivenSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 7, 5};
        int[] subArray = findTheSubarray(arr, 12);
        for (int value : subArray) {
            System.out.print(value + ", ");
        }
        System.out.println();
        findTheSubarrayStartEnd(arr, 12);

        System.out.println();
        arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        subArray = findTheSubarray(arr, 12);
        for (int value : subArray) {
            System.out.print(value + ", ");
        }
        System.out.println();
        findTheSubarrayStartEnd(arr, 15);
    }

    private static int[] findTheSubarray(int[] arr, int sum) {

        Queue<Integer> queue = new LinkedList<>();

        int calculatedSum = 0;
        for (int value : arr) {
            calculatedSum += value;
            queue.add(value);

            if (calculatedSum == sum) {
                break;
            }

            if (calculatedSum > sum) {
                calculatedSum -= queue.remove();
                if (calculatedSum == sum) {
                    break;
                }
            }
        }

        int[] subArray = new int[queue.size()];
        int i = 0;
        while (!queue.isEmpty()) {
            subArray[i] = queue.remove();
            i++;
        }

        return subArray;
    }

    private static void findTheSubarrayStartEnd(int[] arr, int sum) {

        int startIndex = 0;
        int endIndex = 0;
        int calculatedSum = 0;

        for (int i = 0; i < arr.length; i++) {
            calculatedSum += arr[i];
            endIndex = i;

            if (calculatedSum == sum) {
                break;
            }

            if (calculatedSum > sum) {
                calculatedSum -= arr[startIndex];
                startIndex++;
                if (calculatedSum == sum) {
                    break;
                }
            }
        }

        if (startIndex < endIndex) {
            System.out.println(++startIndex + " " + ++endIndex);
        } else {
            System.out.println("-1");
        }
    }
}
