import java.util.Arrays;

public class KthSmallestElement {

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        System.out.println(findKthSmallest(arr, 3));

        arr = new int[] {7, 10, 4, 20, 15};
        System.out.println(findKthSmallest(arr, 4));
    }

    private static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k - 1];
    }
}
