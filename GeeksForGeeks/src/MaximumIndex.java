public class MaximumIndex {

    public static void main(String[] args) {

        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(findMaxIndex(arr));
    }

    private static int findMaxIndex(int[] arr) {

        int difference = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j] && (j - i) > difference) {
                    difference = j - i;
                }
            }
        }
        return difference;
    }
}
