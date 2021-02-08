public class MissingNumberInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        System.out.println(findMissingNumber(arr));

        arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 10};
        System.out.println(findMissingNumber(arr));
    }

    private static int findMissingNumber(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < (arr[i + 1] - 1)) {
                return arr[i] + 1;
            }
        }
        return -1;
    }
}
